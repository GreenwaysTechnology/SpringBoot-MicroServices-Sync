package com.example.demo;

import com.example.demo.javaconfig.AppConfig;
import com.example.demo.javaconfig.HelloWorld;
import com.example.demo.javaconfig.OrderService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringAppV4 {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld helloWorld = context.getBean(HelloWorld.class);
        helloWorld.setMessage("Hello");
        System.out.println(helloWorld.getMessage());

        OrderService orderService = context.getBean(OrderService.class);
        System.out.println(orderService.getOrders());
    }
}
