package com.example.demo.beans;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class CustomerInMemoryRepositoryImpl implements CustomerRepository {

    final Logger logger = LoggerFactory.getLogger(CustomerInMemoryRepositoryImpl.class);

    public List<Customer> findAll() {
        logger.info("CustomerInMemory-findAll");
        return null;
    }

}
