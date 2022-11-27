package com.digika.jwt.controller;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/auth")
public class Auth {
    @PostMapping("/login")
    public UserDetails login(String email, String password) {
        return User.builder().build();
    }
}
