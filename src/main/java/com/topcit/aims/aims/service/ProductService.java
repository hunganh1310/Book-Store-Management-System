package com.topcit.aims.aims.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.topcit.aims.aims.dto.request.ProductCreationRequest;
import com.topcit.aims.aims.entity.Product;
import com.topcit.aims.aims.respository.ProductRepository;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public Product createProduct(ProductCreationRequest request) {
        Product product = new Product();
        product.setTitle(request.getTitle());
        product.setCategory(request.getCategory());
        product.setPrice(request.getPrice());
        product.setQuantity(request.getQuantity());
        product.setAddDate(request.getAddDate());
        product.setProductType(Product.ProductTypeEnum.valueOf(request.getProductType().name()));
        productRepository.save(product);
        return product;
    }

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public Product getProductById(Integer id) {
        return productRepository.findById(id).orElse(null);
    }
}
