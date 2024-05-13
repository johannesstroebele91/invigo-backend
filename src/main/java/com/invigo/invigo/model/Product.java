package com.invigo.invigo.model;

import lombok.Getter;
import lombok.Setter;

// annotations from the Lombok library, which automatically generate getter and setter methods for all fields in the class
// to access and modify these fields,  constructor
@Getter
@Setter
public class Product {
    private Long id;
    private String name;
    private String description;
    private int quantity;

    // constructor that initializes the fields with the provided values
    // AND allows creating new Product instances with initial values
    public Product(long id, String name, String description, int quantity) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.quantity = quantity;
    }
}
