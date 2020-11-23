package com.example.demo.beans;

import java.util.List;

public interface CustomerRepository {
    List<Customer> findAll();
}

