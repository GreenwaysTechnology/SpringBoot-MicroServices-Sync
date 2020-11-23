package com.example.demo;

import com.example.demo.beans.Customer;
import com.example.demo.beans.CustomerServiceImpl;
import com.example.demo.beans.HelloWorld;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApp {
    public static void main(String[] args) {
        //old way of creating object
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.setMessage("Hello");
        System.out.println(helloWorld.getMessage());
        // BeanFactory factory =  new ClassPathXmlApplicationContext("beans.xml");
        ApplicationContext factory = new ClassPathXmlApplicationContext("beans.xml");
        HelloWorld helloWorld1 =   factory.getBean( HelloWorld.class);
       // helloWorld1.setMessage("Hello Message from Spring container");
        System.out.println(helloWorld1.getMessage());
        HelloWorld helloWorld2 =   factory.getBean( HelloWorld.class);


        //customer and address
        Customer customer = factory.getBean("customer", Customer.class);
        System.out.println("Customer Id :" + customer.getCustomerId());
        System.out.println("Customer Name :" + customer.getName());
        System.out.println("Customer City :" + customer.getAddress().getCity());

        //interface
        CustomerServiceImpl customerService = factory.getBean(CustomerServiceImpl.class);
        System.out.println(customerService.findAll());

        //annotations


    }
}
