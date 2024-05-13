package com.invigo.invigo.service;

import com.invigo.invigo.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    // Mock data
    private final List<Product> customers = new ArrayList<>();

    public ProductService() {
        customers.add(new Product(1L, "Product 1", "Description 1", 10));
        customers.add(new Product(1L, "Product 1", "Description 1", 10));
        // Add more mock data as needed
    }

    public List<Product> getAllProducts() {
        return customers;
    }}
