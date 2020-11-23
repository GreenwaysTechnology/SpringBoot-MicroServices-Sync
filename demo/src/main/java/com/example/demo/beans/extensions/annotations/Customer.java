package com.example.demo.beans.extensions.annotations;

import org.springframework.beans.factory.annotation.Required;

public class Customer {
    private int id;
    private Order order;

    public Customer() {
    }

    public Customer(int id, Order order) {
        super();
        this.id = id;
        this.order = order;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Order getOrder() {
        return order;
    }

    @Required
    public void setOrder(Order order) {
        this.order = order;
    }

}
