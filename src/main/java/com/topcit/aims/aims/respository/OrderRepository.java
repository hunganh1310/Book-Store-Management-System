package com.topcit.aims.aims.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.topcit.aims.aims.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Integer> {
    
}
