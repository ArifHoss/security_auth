package com.spring.security_auth.security;

import com.spring.security_auth.model.pojo.Authority;
import com.spring.security_auth.model.pojo.Customer;
import com.spring.security_auth.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import java.util.*;

@Component
@RequiredArgsConstructor
public class ProjectUsernamePasswordAuthenticationProvider implements AuthenticationProvider {

    private final CustomerRepository customerRepository;
    private final PasswordEncoder passwordEncoder;

    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        String username = authentication.getName();
        String password = authentication.getCredentials().toString();
        List<Customer> customer = customerRepository.findByEmail(username);
        if (customer.size() > 0) {
            if (passwordEncoder.matches(password, customer.get(0).getPwd())) {
                return new UsernamePasswordAuthenticationToken(username, password, getGrantedAuthorities(customer.get(0).getAuthorities()));
            } else {
                throw new BadCredentialsException("INVALID_PASSWORD");
            }
        } else {
            throw new BadCredentialsException("INVALID_USER");
        }
    }

    private List<GrantedAuthority> getGrantedAuthorities(Set<Authority> authorities) {
        List<GrantedAuthority> grantedAuthorities = new ArrayList<>();
        for (Authority authority : authorities) {
            grantedAuthorities.add(new SimpleGrantedAuthority(authority.getName()));
        }
        return grantedAuthorities;
    }


    @Override
    public boolean supports(Class<?> authentication) {
        return (UsernamePasswordAuthenticationToken.class.isAssignableFrom(authentication));
    }
}
