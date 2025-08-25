package com.topcit.aims.aims.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.topcit.aims.aims.dto.request.CustomerCreationRequest;
import com.topcit.aims.aims.entity.Customer;
import com.topcit.aims.aims.service.CustomerService;

@RestController
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @PostMapping("/customers")
    public Customer createCustomer(@RequestBody CustomerCreationRequest request) {
        return customerService.createCustomer(request);
    }

    @GetMapping("/customers")
    public List<Customer> getAllCustomers() {
        return customerService.getAllCustomers();
    }

    @GetMapping("/customers/{id}")
    public Customer getCustomerById(@RequestBody int id) {
        return customerService.getCustomerById(id);
    }
}
