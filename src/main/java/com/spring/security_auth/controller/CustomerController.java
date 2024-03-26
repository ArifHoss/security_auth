package com.spring.security_auth.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

    @GetMapping("customers")
    public String getAllCustomer() {
        return "Hello from 'Customer'!";
    }
}
