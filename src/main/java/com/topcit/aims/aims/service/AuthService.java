package com.topcit.aims.aims.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.topcit.aims.aims.respository.CustomerRepository;

@Service
public class AuthService {
    @Autowired
    private CustomerRepository customerRepository;

    public boolean login(String email, String rawpassword) {
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        return customerRepository.findByEmail(email)
                .map(customer -> passwordEncoder.matches(rawpassword, customer.getPasswordHash()))
                .orElse(false);
    }
}
