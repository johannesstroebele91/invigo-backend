package com.invigo.invigo.service;

import com.invigo.invigo.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

// annotation marks the class as a service component in the Spring context
// allowing it to be automatically detected & instantiated by Spring
@Service
public class ProductService {
    // declares a private final instance variable products of type List<Product>
    // AND initializes it with a new ArrayList
    private final List<Product> products = new ArrayList<>();

    // constructor of the ProductService class
    // 2 mock products are added via the `add()` method
    public ProductService() {
        products.add(new Product(1L, "Product 1", "Description 1", 10));
        products.add(new Product(1L, "Product 1", "Description 1", 10));
        products.add(new Product(1L, "Product 1", "Description 1", 10));
        // Add more mock data as needed
    }

    // method returns the list of products stored in the products instance variable
    public List<Product> getAllProducts() {
        return products;
    }}
