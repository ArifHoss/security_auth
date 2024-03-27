package com.spring.security_auth.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {

    @GetMapping("myAccounts")
    public String getMyAccounts() {
        return "Hello from 'AccountController'!";
    }
}
