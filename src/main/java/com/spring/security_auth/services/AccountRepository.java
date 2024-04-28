package com.spring.security_auth.services;

import com.spring.security_auth.model.pojo.Accounts;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Accounts, Long> {
    Accounts findByCustomerId(int customerId);

}
