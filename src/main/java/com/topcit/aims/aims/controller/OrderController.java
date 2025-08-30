package com.topcit.aims.aims.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.topcit.aims.aims.dto.response.CustomerSpendingDTO;
import com.topcit.aims.aims.entity.Order;
import com.topcit.aims.aims.service.OrderService;

@RestController
public class OrderController {
    @Autowired
    private OrderService orderService;


    @GetMapping("/orders")
    public List<Order> getAllOrders() {
        return orderService.getAllOrders();
    }

    @GetMapping("/customer-spending")
    public List<CustomerSpendingDTO> getCustomerSpending() {
        return orderService.getCustomerSpending();
    }
}
