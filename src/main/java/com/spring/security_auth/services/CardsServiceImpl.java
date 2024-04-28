package com.spring.security_auth.services;

import com.spring.security_auth.model.pojo.Cards;
import com.spring.security_auth.repository.CardsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class CardsServiceImpl implements CardsService{

    private final CardsRepository cardsRepository;
    @Override
    public List<Cards> findByCustomerId(int id) {
        return cardsRepository.findByCustomerId(id);
    }
}
