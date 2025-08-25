package com.topcit.aims.aims.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.topcit.aims.aims.dto.request.OrderCreationRequest;
import com.topcit.aims.aims.entity.Order;
import com.topcit.aims.aims.respository.OrderRepository;

@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;

    public Order createOrder(OrderCreationRequest request) {
        Order order = new Order();
        order.setCustomerID(request.getCustomerID());
        order.setOrderDate(request.getOrderDate());
        order.setTotalAmount(request.getTotalAmount());
        order.setVat(request.getVat());
        order.setShippingFee(request.getShippingFee());
        order.setStatus(Order.Status.valueOf(request.getStatus().name()));
        orderRepository.save(order);
        return order;
    }

    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }

    public Order getOrderById(Integer id) {
        return orderRepository.findById(id).orElse(null);
    }
}
