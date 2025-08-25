package com.topcit.aims.aims.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.topcit.aims.aims.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {
    
}
