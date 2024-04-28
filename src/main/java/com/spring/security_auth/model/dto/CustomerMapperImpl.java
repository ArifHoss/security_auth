package com.spring.security_auth.model.dto;

import com.spring.security_auth.model.pojo.Customer;
import org.springframework.stereotype.Service;

@Service
public class CustomerMapperImpl implements CustomerMapper{


    @Override
    public CustomerResponseDto toDto(Customer customer) {
        CustomerResponseDto dto = new CustomerResponseDto();
        dto.setId(customer.getId());
        dto.setName(customer.getName());
        dto.setEmail(customer.getEmail());
        dto.setMobile_number(customer.getMobileNumber());
        dto.setCreateDt(customer.getCreateDt());
        dto.setRole(customer.getRole());
        return dto;
    }

    @Override
    public Customer toCustomer(CustomerDto dto) {
        Customer customer = new Customer();
        customer.setId(dto.getId());
        customer.setName(dto.getName());
        customer.setEmail(dto.getEmail());
        customer.setMobileNumber(dto.getMobile_number());
        customer.setPwd(dto.getPwd());
        customer.setRole(dto.getRole());
        customer.setCreateDt(dto.getCreateDt());
        return customer;
    }
}
