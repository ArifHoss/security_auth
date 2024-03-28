package com.spring.security_auth.services;

import com.spring.security_auth.model.pojo.Customer;
import com.spring.security_auth.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {
    private final CustomerRepository customerRepository;
    private final PasswordEncoder passwordEncoder;

    @Override
    public List<Customer> getAllCustomer() {
        return customerRepository.findAll();
    }

    @Override
    public Customer create(Customer customer) {

        String email = customer.getEmail();

        boolean existsCustomerByEmail = customerRepository.existsCustomerByEmail(email);
        if (existsCustomerByEmail) throw new UsernameNotFoundException("USER_ALREADY_EXIST " + email);
        if (email.isEmpty()) throw new IllegalArgumentException("EMAIL_CAN_NOT_BE_EMPTY");
        customer.setPassword(passwordEncoder.encode(customer.getPassword()));

        return customerRepository.save(customer);
    }

}
