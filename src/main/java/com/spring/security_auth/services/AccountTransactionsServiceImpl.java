package com.spring.security_auth.services;

import com.spring.security_auth.model.pojo.AccountTransactions;
import com.spring.security_auth.repository.AccountTransactionsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AccountTransactionsServiceImpl implements AccountTransactionsService{
    private final AccountTransactionsRepository accountTransactionsRepository;

    @Override
    public List<AccountTransactions> findByCustomerIdOrderByTransactionDtDesc(int id) {
        return accountTransactionsRepository.findByCustomerIdOrderByTransactionDtDesc(id);
    }
}
