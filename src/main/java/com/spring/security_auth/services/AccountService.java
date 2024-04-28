package com.spring.security_auth.services;

import com.spring.security_auth.model.pojo.Accounts;

public interface AccountService {
    Accounts findByCustomerId(int id);
}
