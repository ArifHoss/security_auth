package com.spring.security_auth.services;

import com.spring.security_auth.model.pojo.Cards;

import java.util.List;

public interface CardsService {
    List<Cards> findByCustomerId(int id);
}
