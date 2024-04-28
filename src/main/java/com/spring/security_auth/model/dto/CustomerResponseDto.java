package com.spring.security_auth.model.dto;

import lombok.Data;

@Data
public class CustomerResponseDto {
    private int id;
    private String name;
    private String email;
    private String mobile_number;
    private String role;
    private String createDt;
}
