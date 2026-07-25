package com.example.orderservice.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.Data;

@Data
public class OrderRequest {

    @NotNull(message = "productId is required")
    private Long productId;

    @Positive(message = "quantity must be greater than zero")
    private int quantity;
}
