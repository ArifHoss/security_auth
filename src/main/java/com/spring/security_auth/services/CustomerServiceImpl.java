package com.spring.security_auth.services;

import com.spring.security_auth.model.pojo.Customer;
import com.spring.security_auth.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;
import java.util.Locale;

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
        String encoded = passwordEncoder.encode(customer.getPwd());
        customer.setPwd(encoded);

        SimpleDateFormat sdf = new SimpleDateFormat("dd-mm-yyyy HH:mm");
        Date date = new Date(System.currentTimeMillis());
        customer.setCreateDt(sdf.format(date));

        return customerRepository.save(customer);
    }

    @Override
    public Customer getUserDetailsAfterLogin(Authentication authentication) {
        List<Customer> customers = customerRepository.findByEmail(authentication.getName());
        if (customers.size() > 0) {
            return customers.get(0);
        } else {
            return null;
        }
    }

}
