package com.topcit.aims.aims.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.topcit.aims.aims.dto.response.CustomerSpendingDTO;
import com.topcit.aims.aims.entity.Orders;
import com.topcit.aims.aims.respository.OrderRepository;

@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;

    public List<Orders> getAllOrders() {
        return orderRepository.findAll();
    }

    public List<CustomerSpendingDTO> getCustomerSpending() {
        return orderRepository.getCustomerSpending();
    }
}
