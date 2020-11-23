package com.example.demo.beans.extensions.annotations.stero;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
@Scope(value = "prototype")
public class OrderService {

    @Autowired
    private OrderRepository repository;

    @PostConstruct
    public void init(){
        System.out.println("Order service is ready");
    }

    public  OrderService(){
        System.out.println("order services");
    }

    public OrderRepository getRepository() {
        return repository;
    }

    public void setRepository(OrderRepository repository) {
        this.repository = repository;
    }

    public String getOrders() {
        return repository.getOrders();
    }
}
