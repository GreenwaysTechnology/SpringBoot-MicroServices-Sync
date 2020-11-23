package com.example.demo.javaconfig;

import org.springframework.stereotype.Repository;

@Repository
public class OrderRepository {
    public String getOrders() {
        return "Orders";
    }
}
