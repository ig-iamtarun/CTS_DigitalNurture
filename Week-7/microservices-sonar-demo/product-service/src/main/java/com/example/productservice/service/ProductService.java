package com.example.productservice.service;

import com.example.productservice.exception.ResourceNotFoundException;
import com.example.productservice.model.Product;
import com.example.productservice.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public Product getProductById(Long id) {
        return productRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Product not found with id: " + id));
    }

    public Product createProduct(Product product) {
        return productRepository.save(product);
    }

    public boolean existsAndHasStock(Long id, int requestedQuantity) {
        return productRepository.findById(id)
                .map(product -> product.getStock() >= requestedQuantity)
                .orElse(false);
    }
}
