package com.said.springboot.myfirstwebapp;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
    public boolean authenticate(String username, String password) {
       boolean isValidUsername = username.equalsIgnoreCase("Said");
       boolean isValidPassword = password.equals("testpass123");
       return isValidUsername && isValidPassword;
    }
}
