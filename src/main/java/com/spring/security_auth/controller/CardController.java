package com.spring.security_auth.controller;

import com.spring.security_auth.model.pojo.Cards;
import com.spring.security_auth.services.CardsService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class CardController {
    private final CardsService cardsService;

    @GetMapping("myCards")
    public List<Cards> findByCustomerId(@RequestParam int id) {
        return cardsService.findByCustomerId(id);
    }
}
