package com.example.springbootautoconfigure;

import org.springframework.stereotype.Service;

@Service
public class ClientService {
    public ClientService() {
        System.out.println("Client Service");
    }

    public String getClientInfo() {
        return "clientinfo";
    }
}
