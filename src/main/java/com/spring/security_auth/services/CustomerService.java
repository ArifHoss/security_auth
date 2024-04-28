package com.spring.security_auth.services;

import com.spring.security_auth.model.pojo.Customer;
import org.springframework.security.core.Authentication;

import java.util.List;

public interface CustomerService {
    List<Customer> getAllCustomer();

    Customer create(Customer customer);

    Customer getUserDetailsAfterLogin(Authentication authentication);
}
