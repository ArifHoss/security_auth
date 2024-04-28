package com.spring.security_auth.repository;

import com.spring.security_auth.model.pojo.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactRepository extends JpaRepository<Contact,Long> {
}
