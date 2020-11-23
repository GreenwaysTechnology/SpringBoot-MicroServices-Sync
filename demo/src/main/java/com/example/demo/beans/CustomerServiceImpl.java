package com.example.demo.beans;

import java.util.List;

public class CustomerServiceImpl {

    //depenance
    private CustomerRepository repository;

    public CustomerServiceImpl() {

    }
    public CustomerServiceImpl(CustomerRepository repository) {
        super();
        this.repository = repository;
    }

    public CustomerRepository getRepository() {
        return repository;
    }

    public void setRepository(CustomerRepository repository) {
        this.repository = repository;
    }

    public List<Customer> findAll() {
        return repository.findAll();
    }

}
