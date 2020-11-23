package com.example.demo.beans;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class CustomerJPARepositoryImpl implements CustomerRepository {
    final Logger logger = LoggerFactory.getLogger(CustomerJPARepositoryImpl.class);

    public List<Customer> findAll() {
        logger.info("CustomerJPARepositoryImpl-findAll");

        return null;
    }

}
