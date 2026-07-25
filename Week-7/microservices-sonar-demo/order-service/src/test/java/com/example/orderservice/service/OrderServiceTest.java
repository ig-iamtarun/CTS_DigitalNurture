package com.example.orderservice.service;

import com.example.orderservice.client.ProductClient;
import com.example.orderservice.dto.OrderRequest;
import com.example.orderservice.exception.ResourceNotFoundException;
import com.example.orderservice.model.Order;
import com.example.orderservice.repository.OrderRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

class OrderServiceTest {

    @Mock
    private OrderRepository orderRepository;

    @Mock
    private ProductClient productClient;

    private OrderService orderService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        orderService = new OrderService(orderRepository, productClient);
    }

    @Test
    void placeOrder_confirmsOrder_whenProductAvailable() {
        OrderRequest request = new OrderRequest();
        request.setProductId(1L);
        request.setQuantity(2);

        when(productClient.isAvailable(1L, 2)).thenReturn(true);
        when(orderRepository.save(any(Order.class))).thenAnswer(invocation -> invocation.getArgument(0));

        Order result = orderService.placeOrder(request);

        assertEquals("CONFIRMED", result.getStatus());
    }

    @Test
    void placeOrder_rejectsOrder_whenProductUnavailable() {
        OrderRequest request = new OrderRequest();
        request.setProductId(1L);
        request.setQuantity(50);

        when(productClient.isAvailable(1L, 50)).thenReturn(false);
        when(orderRepository.save(any(Order.class))).thenAnswer(invocation -> invocation.getArgument(0));

        Order result = orderService.placeOrder(request);

        assertEquals("REJECTED", result.getStatus());
    }

    @Test
    void getOrderById_throws_whenNotFound() {
        when(orderRepository.findById(99L)).thenReturn(Optional.empty());

        assertThrows(ResourceNotFoundException.class, () -> orderService.getOrderById(99L));
    }
}
