package com.example.socket;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
public class SocketApplication {

    public static void main(String[] args) throws IOException {
        GreetServer server=new GreetServer();
        server.start(59999);
    }
}
