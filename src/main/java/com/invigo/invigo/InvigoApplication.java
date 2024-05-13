package com.invigo.invigo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class InvigoApplication {

    public static void main(String[] args) {

        SpringApplication.run(InvigoApplication.class, args);
        System.out.println("http://localhost:8080/api/v1/products");
    }
}
