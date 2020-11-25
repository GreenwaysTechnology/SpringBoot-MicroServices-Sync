package com.example.accessingdatamysql;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customers, Integer> {
    //custom query api
    List<Customers> findByCustomerName(String name);
}
