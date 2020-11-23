package com.example.demo.beans.extensions.annotations.stero;

import org.springframework.stereotype.Repository;

@Repository
public class OrderRepository {
    public String getOrders() {
        return "Orders Repo";
    }
}
