package com.topcit.aims.aims.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.topcit.aims.aims.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
    
}
