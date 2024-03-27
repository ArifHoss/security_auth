package com.spring.security_auth.model.dto;

import com.spring.security_auth.model.pojo.Customer;

public interface CustomerMapper {
    CustomerResponseDto toDto(Customer customer);
    Customer toCustomer(CustomerDto dto);
}
