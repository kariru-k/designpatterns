package com.example.designpatterns.behavioralpatterns.chainofresponsibility;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.example.designpatterns.behavioralpatterns.chainofresponsibility.handlers.RoleCheckHandler;
import com.example.designpatterns.behavioralpatterns.chainofresponsibility.handlers.UserExistsHandler;

public class Demo {
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static Server server;

    private static void init(){
        server = new Server();
        server.register("admin@example.com", "admin");
        server.register("user@example.com", "user");

        Handler handler = Handler.link(new UserExistsHandler(server), new RoleCheckHandler());

        server.setHandler(handler);
    }

    public static void main(String[] args) throws IOException {
        init();

        boolean success;
        do {
            System.out.print("Enter email: ");
            String email = reader.readLine();
            System.out.print("Input password: ");
            String password = reader.readLine();
            success = server.logIn(email, password);
        } while (!success);
    }
}
