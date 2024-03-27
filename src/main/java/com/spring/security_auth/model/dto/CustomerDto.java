package com.spring.security_auth.model.dto;

import lombok.Data;

@Data
public class CustomerDto {
    private Long id;
    private String email;
    private String password;
    private String role;
}
