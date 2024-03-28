package com.spring.security_auth.repository;

import com.spring.security_auth.model.pojo.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
    Optional<Customer> findCustomerByEmail(String email);

    boolean existsCustomerByEmail(String email);

}
