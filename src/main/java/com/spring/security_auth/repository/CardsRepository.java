package com.spring.security_auth.repository;

import com.spring.security_auth.model.pojo.Cards;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CardsRepository extends JpaRepository<Cards,Long> {
    //findByCustomerId
    List<Cards> findByCustomerId(int id);
}
