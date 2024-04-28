package com.spring.security_auth.services;

import com.spring.security_auth.model.pojo.AccountTransactions;

import java.util.List;

public interface AccountTransactionsService {
    List<AccountTransactions> findByCustomerIdOrderByTransactionDtDesc(int id);
}
