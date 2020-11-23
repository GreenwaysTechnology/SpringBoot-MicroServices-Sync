package com.example.demo.beans.extensions.annotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class ClientService {

    @PostConstruct
    public void init() {
        System.out.println("init");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("destroy");
    }
}
