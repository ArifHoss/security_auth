package com.spring.security_auth.security;

import com.spring.security_auth.model.pojo.Customer;
import com.spring.security_auth.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ProjectUserDetailsService implements UserDetailsService {
    private final CustomerRepository customerRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<Customer> customer = customerRepository.findCustomerByEmail(username);
        String password;
        List<GrantedAuthority> authorities = new ArrayList<>();
        if (customer.isPresent()) {
            password = customer.get().getPassword();
            authorities.add(new SimpleGrantedAuthority(customer.get().getRole()));

        } else {
            throw new UsernameNotFoundException("USER_NOT_EXIST_WITH "+username);
        }
        return new User(username, password, authorities);
    }

}
