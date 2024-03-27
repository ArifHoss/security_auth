package com.spring.security_auth.model.dto;

import com.spring.security_auth.model.pojo.Customer;
import org.springframework.stereotype.Service;

@Service
public class CustomerMapperImpl implements CustomerMapper{
    @Override
    public CustomerResponseDto toDto(Customer customer) {
        CustomerResponseDto dto = new CustomerResponseDto();
        dto.setId(customer.getId());
        dto.setEmail(customer.getEmail());
        dto.setRole(customer.getRole());
        return dto;
    }

    @Override
    public Customer toCustomer(CustomerDto dto) {
        Customer customer = new Customer();
        customer.setId(dto.getId());
        customer.setEmail(dto.getEmail());
        customer.setRole(dto.getRole());
        return customer;
    }
}
