package com.example.genaichatbot.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


public class AnthropicDtos {

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class MessageRequest {
        private String model;
        private int max_tokens;
        private List<Message> messages;
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Message {
        private String role;    // "user" or "assistant"
        private String content; // plain text content for this simple example
    }

    @Data
    @NoArgsConstructor
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class MessageResponse {
        private String id;
        private String model;
        private List<ContentBlock> content;
        private String stop_reason;
    }

    @Data
    @NoArgsConstructor
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class ContentBlock {
        private String type; // "text" for a simple chat reply
        private String text;
    }
}
