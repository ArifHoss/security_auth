package com.spring.security_auth.services;

import com.spring.security_auth.model.pojo.Accounts;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AccountServiceImpl implements AccountService{

    private final AccountRepository accountRepository;

    @Override
    public Accounts findByCustomerId(int id) {
        return accountRepository.findByCustomerId(id);
    }
}
