package com.topcit.aims.aims.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.topcit.aims.aims.dto.request.CustomerCreationRequest;
import com.topcit.aims.aims.entity.Customer;
import com.topcit.aims.aims.respository.CustomerRepository;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    public Customer createCustomer(CustomerCreationRequest request) {
        Customer customer = new Customer();
        customer.setFullName(request.getFullName());
        customer.setEmail(request.getEmail());
        customer.setPasswordHash(request.getPasswordHash());
        customer.setAddress(request.getAddress());
        customerRepository.save(customer);
        return customer;
    }

    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    public Customer getCustomerById(Integer id) {
        return customerRepository.findById(id).orElse(null);
    }
}
