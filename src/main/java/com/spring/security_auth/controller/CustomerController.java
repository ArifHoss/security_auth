package com.spring.security_auth.controller;

import com.spring.security_auth.model.dto.CustomerMapper;
import com.spring.security_auth.model.dto.CustomerResponseDto;
import com.spring.security_auth.model.pojo.Customer;
import com.spring.security_auth.services.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequiredArgsConstructor
public class CustomerController {

    private final CustomerService customerService;
    private final CustomerMapper customerMapper;

    @GetMapping("customers")
    public List<CustomerResponseDto> getAllCustomer() {
        List<Customer> customers = customerService.getAllCustomer();
        return customers.stream().map(customerMapper::toDto).collect(Collectors.toList());
    }
}
