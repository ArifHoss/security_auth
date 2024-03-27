package com.spring.security_auth.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BalanceController {

    @GetMapping("myBalances")
    public String getBalances() {
        return "Hello from 'BalanceController'!";
    }
}
