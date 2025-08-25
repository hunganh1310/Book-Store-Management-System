package com.topcit.aims.aims.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.topcit.aims.aims.dto.request.ProductCreationRequest;
import com.topcit.aims.aims.entity.Product;
import com.topcit.aims.aims.service.ProductService;

@RestController
public class ProductController {
    @Autowired
    private ProductService productService;

    @PostMapping("/products")
    public Product createProduct(@RequestBody ProductCreationRequest request) {
        return productService.createProduct(request);
    }

    @GetMapping("/products")
    public java.util.List<Product> getAllProducts() {
        return productService.getAllProducts();
    }
}
