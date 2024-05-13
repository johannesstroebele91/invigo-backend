package com.invigo.invigo.controller;

import com.invigo.invigo.model.Product;
import com.invigo.invigo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController // annotation marks the class as a controller that handles REST API requests
@RequestMapping("/api/v1/products") // annotation maps all the request handlers in this class to the base URL `/api/v1/products`
public class ProductController {

    // declares a final instance variable productService of type ProductService.
    private final ProductService productService;

    // automatically injects an instance of ProductService into this constructor when creating an instance of ProductController
    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    // annotation maps the getAllProducts() method to the HTTP GET request for the base URL `/api/v1/products`
    // ´getAllProducts()´ method returns a ResponseEntity with a list of Product objects as the response body
    // creates a successful HTTP response (status code 200 OK) with the list of products returned by the productService.getAllProducts() method as the response body
    @GetMapping
    public ResponseEntity<List<Product>> getAllProducts() {
        return ResponseEntity.ok(productService.getAllProducts());
    }

    // Add methods for other API endpoints (create, update, delete products)
}
