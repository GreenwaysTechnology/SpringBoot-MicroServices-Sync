package com.example.accessingdatamysql;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class Customers {
    @Id
    @GeneratedValue
    @Column(name = "customernumber")
    private Integer customerNumber;
    @Column(name = "customername")
    private String customerName;
    @Column(name = "city")
    private String city;
    @Column(name = "state")
    private String state;
    @Column(name = "creditlimit")
    private double creditLimit;

}
