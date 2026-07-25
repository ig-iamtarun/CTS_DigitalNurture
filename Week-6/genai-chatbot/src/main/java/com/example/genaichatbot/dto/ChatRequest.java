package com.example.genaichatbot.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

import java.util.List;

@Data
public class ChatRequest {

    @NotBlank(message = "message must not be blank")
    private String message;

   
    private List<ChatTurn> history;

    @Data
    public static class ChatTurn {
        @NotBlank
        private String role; // "user" or "assistant"

        @NotBlank
        private String content;
    }
}
