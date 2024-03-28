package com.spring.security_auth.services;

import com.spring.security_auth.model.pojo.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> getAllCustomer();

    Customer create(Customer customer);
}
