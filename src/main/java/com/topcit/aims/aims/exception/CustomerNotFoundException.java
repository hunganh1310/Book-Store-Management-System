package com.topcit.aims.aims.exception;

public class CustomerNotFoundException extends RuntimeException {
    public CustomerNotFoundException(Integer id) {
        super("Customer not found with id: " + id);
    }
}
