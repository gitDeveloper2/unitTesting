package com.gitdeveloper2.tdd.security;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

public class MyUserDetailsService implements UserDetailsService {
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        if(username.equals("admin"))
            return User.builder()
                    .username("admin")
                    .password("admin")
                    .authorities("ADMIN")
                    .build();
        throw new UsernameNotFoundException("Invalid data provided");
    }
}
