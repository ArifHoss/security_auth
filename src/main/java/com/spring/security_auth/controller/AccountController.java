package com.spring.security_auth.controller;

import com.spring.security_auth.model.pojo.Accounts;
import com.spring.security_auth.services.AccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class AccountController {

    private final AccountService accountService;

    @GetMapping("myAccounts")
    public Accounts getMyAccounts(@RequestParam int id) {
        return accountService.findByCustomerId(id);
    }
}
