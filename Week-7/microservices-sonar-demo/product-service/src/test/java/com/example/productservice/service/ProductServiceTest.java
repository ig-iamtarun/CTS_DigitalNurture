package com.example.productservice.service;

import com.example.productservice.exception.ResourceNotFoundException;
import com.example.productservice.model.Product;
import com.example.productservice.repository.ProductRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

class ProductServiceTest {

    @Mock
    private ProductRepository productRepository;

    private ProductService productService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        productService = new ProductService(productRepository);
    }

    @Test
    void getProductById_returnsProduct_whenFound() {
        Product product = new Product(1L, "Keyboard", 49.99, 10);
        when(productRepository.findById(1L)).thenReturn(Optional.of(product));

        Product result = productService.getProductById(1L);

        assertEquals("Keyboard", result.getName());
    }

    @Test
    void getProductById_throws_whenNotFound() {
        when(productRepository.findById(99L)).thenReturn(Optional.empty());

        assertThrows(ResourceNotFoundException.class, () -> productService.getProductById(99L));
    }

    @Test
    void existsAndHasStock_returnsTrue_whenEnoughStock() {
        Product product = new Product(1L, "Mouse", 19.99, 5);
        when(productRepository.findById(1L)).thenReturn(Optional.of(product));

        assertTrue(productService.existsAndHasStock(1L, 3));
    }

    @Test
    void existsAndHasStock_returnsFalse_whenNotEnoughStock() {
        Product product = new Product(1L, "Mouse", 19.99, 2);
        when(productRepository.findById(1L)).thenReturn(Optional.of(product));

        assertFalse(productService.existsAndHasStock(1L, 5));
    }

    @Test
    void existsAndHasStock_returnsFalse_whenProductMissing() {
        when(productRepository.findById(42L)).thenReturn(Optional.empty());

        assertFalse(productService.existsAndHasStock(42L, 1));
    }
}
