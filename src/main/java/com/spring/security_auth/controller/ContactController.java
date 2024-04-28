package com.spring.security_auth.controller;

import com.spring.security_auth.model.pojo.Contact;
import com.spring.security_auth.repository.ContactRepository;
import com.spring.security_auth.services.ContactService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Date;
import java.util.Random;

@RestController
@RequiredArgsConstructor
public class ContactController {

    private final ContactService contactService;

    @PostMapping("/contact")
    public Contact saveContactInquiryDetails(@RequestBody Contact contact) {
        return contactService.create(contact);
    }

    public String getServiceReqNumber() {
        Random random = new Random();
        int ranNum = random.nextInt(999999999 - 9999) + 9999;
        return "SR"+ranNum;
    }
}
