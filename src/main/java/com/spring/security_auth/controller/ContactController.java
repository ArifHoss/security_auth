package com.spring.security_auth.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContactController {

    @GetMapping("contacts")
    public String getContacts() {
        return "Hello from 'ContactController'!";
    }
}
