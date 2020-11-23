package com.example.demo;

import com.example.demo.beans.extensions.annotations.stero.Greeter;
import com.example.demo.beans.extensions.annotations.stero.OrderRepository;
import com.example.demo.beans.extensions.annotations.stero.OrderService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringAppV3 {
    public static void main(String[] args) {
        ApplicationContext factory = new ClassPathXmlApplicationContext("beans.xml");
        Greeter greeter = factory.getBean(Greeter.class);
        greeter.setMessage("Component ");
        System.out.println(greeter.getMessage());

        OrderService orderService = null;
        orderService =factory.getBean(OrderService.class);
        System.out.println(orderService.hashCode());
        System.out.println(orderService.getOrders());

        orderService =factory.getBean(OrderService.class);
        System.out.println(orderService.hashCode());
        System.out.println(orderService.getOrders());
    }
}
