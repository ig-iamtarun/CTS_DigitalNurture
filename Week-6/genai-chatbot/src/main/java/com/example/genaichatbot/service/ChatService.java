package com.example.genaichatbot.service;

import com.example.genaichatbot.dto.AnthropicDtos.Message;
import com.example.genaichatbot.dto.AnthropicDtos.MessageRequest;
import com.example.genaichatbot.dto.AnthropicDtos.MessageResponse;
import com.example.genaichatbot.dto.ChatRequest;
import com.example.genaichatbot.dto.ChatResponse;
import com.example.genaichatbot.exception.AnthropicApiException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.WebClientResponseException;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ChatService {

    private final WebClient anthropicWebClient;

    @Value("${anthropic.api.model}")
    private String model;

    @Value("${anthropic.api.max-tokens}")
    private int maxTokens;

    public ChatService(WebClient anthropicWebClient) {
        this.anthropicWebClient = anthropicWebClient;
    }

    public ChatResponse chat(ChatRequest request) {
        List<Message> messages = new ArrayList<>();

        if (request.getHistory() != null) {
            messages.addAll(
                    request.getHistory().stream()
                            .map(turn -> new Message(turn.getRole(), turn.getContent()))
                            .collect(Collectors.toList())
            );
        }
        messages.add(new Message("user", request.getMessage()));

        MessageRequest anthropicRequest = new MessageRequest(model, maxTokens, messages);

        try {
            MessageResponse response = anthropicWebClient.post()
                    .uri("/v1/messages")
                    .bodyValue(anthropicRequest)
                    .retrieve()
                    .bodyToMono(MessageResponse.class)
                    .block();

            if (response == null || response.getContent() == null || response.getContent().isEmpty()) {
                throw new AnthropicApiException("Anthropic API returned an empty response");
            }

            String reply = response.getContent().stream()
                    .filter(block -> "text".equals(block.getType()))
                    .map(block -> block.getText())
                    .collect(Collectors.joining("\n"));

            return new ChatResponse(reply, response.getModel());

        } catch (WebClientResponseException e) {
            throw new AnthropicApiException(
                    "Anthropic API call failed with status " + e.getStatusCode() + ": " + e.getResponseBodyAsString(),
                    e
            );
        }
    }
}
