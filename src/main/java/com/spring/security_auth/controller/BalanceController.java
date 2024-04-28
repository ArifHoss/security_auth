package com.spring.security_auth.controller;

import com.spring.security_auth.model.pojo.AccountTransactions;
import com.spring.security_auth.services.AccountTransactionsService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class BalanceController {

    private final AccountTransactionsService accountTransactionsService;

    @GetMapping("myBalances")
    public List<AccountTransactions> getBalances(@RequestParam int id) {
        return accountTransactionsService.findByCustomerIdOrderByTransactionDtDesc(id);
    }
}
