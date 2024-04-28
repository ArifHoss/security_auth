package com.spring.security_auth.services;

import com.spring.security_auth.model.pojo.Contact;
import com.spring.security_auth.repository.ContactRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.Random;

@Service
@RequiredArgsConstructor
public class ContactServiceImpl implements ContactService{

    private final ContactRepository contactRepository;
    @Override
    public Contact create(Contact contact) {
        contact.setContactId(getServiceReqNumber());
        contact.setCreateDt(new Date(System.currentTimeMillis()));
        return contactRepository.save(contact);
    }

    public String getServiceReqNumber() {
        Random random = new Random();
        int ranNum = random.nextInt(999999999 - 9999) + 9999;
        return "SR"+ranNum;
    }
}
