package com.example.designpatterns.behavioralpatterns.chainofresponsibility.handlers;

import com.example.designpatterns.behavioralpatterns.chainofresponsibility.Handler;

public class RoleCheckHandler extends Handler{

    @Override
    public boolean check(String email, String password) {
            if (email.equals("admin@example.com")) {
                System.out.println("Hello, admin!");
                return true;
            }
            System.out.println("Hello, user!");
            return checkNext(email, password);
    }
    
}
