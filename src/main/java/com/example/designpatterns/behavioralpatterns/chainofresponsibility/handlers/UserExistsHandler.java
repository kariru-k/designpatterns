package com.example.designpatterns.behavioralpatterns.chainofresponsibility.handlers;

import com.example.designpatterns.behavioralpatterns.chainofresponsibility.Handler;
import com.example.designpatterns.behavioralpatterns.chainofresponsibility.Server;

public class UserExistsHandler extends Handler{
    
    public UserExistsHandler(Server server) {
        this.server = server;
    }

    private Server server;

    @Override
    public boolean check(String email, String password) {
        if (!server.hasEmail(email)) {
            System.out.println("No user exists with this email");
            return false;
        }
        if(!server.isValidPassword(email, password)){
            System.out.println("Incorrect credentials");
            return false;
        }
        return checkNext(email, password);
    }
    
}
