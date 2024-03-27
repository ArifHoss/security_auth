package com.spring.security_auth.model.dto;

import lombok.Data;

@Data
public class CustomerResponseDto {
    private Long id;
    private String email;
    private String role;
}
