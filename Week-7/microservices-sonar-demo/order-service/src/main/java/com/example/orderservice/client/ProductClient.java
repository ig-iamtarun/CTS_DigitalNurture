package com.example.orderservice.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.Map;

@Component
public class ProductClient {

    private final WebClient webClient;

    public ProductClient(WebClient.Builder webClientBuilder,
                          @Value("${product-service.base-url}") String productServiceBaseUrl) {
        this.webClient = webClientBuilder.baseUrl(productServiceBaseUrl).build();
    }

    /**
     * Calls product-service to check whether a product exists and has enough stock.
     * Returns false (fail-safe) if product-service is unreachable or errors out,
     * rather than letting the whole order flow blow up.
     */
    public boolean isAvailable(Long productId, int quantity) {
        try {
            Map<String, Boolean> response = webClient.get()
                    .uri("/api/products/{id}/availability?quantity={qty}", productId, quantity)
                    .retrieve()
                    .bodyToMono(Map.class)
                    .block();

            return response != null && Boolean.TRUE.equals(response.get("available"));
        } catch (Exception e) {
            return false;
        }
    }
}
