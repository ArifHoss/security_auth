package com.spring.security_auth.repository;

import com.spring.security_auth.model.pojo.AccountTransactions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccountTransactionsRepository extends JpaRepository<AccountTransactions,Long> {

    List<AccountTransactions> findByCustomerIdOrderByTransactionDtDesc(int id);
}
