package com.example.demo;

import com.example.demo.beans.extensions.annotations.ClientService;
import com.example.demo.beans.extensions.annotations.Customer;
import com.example.demo.beans.extensions.annotations.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringAppV2 {
    public static void main(String[] args) {
        ApplicationContext factory = new ClassPathXmlApplicationContext("beans.xml");
        Customer customer = factory.getBean(Customer.class);
        System.out.println(customer.getOrder().getOrderId());

        //
        Employee employee = factory.getBean(Employee.class);
        System.out.println(employee.getProject());

        ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
        ClientService service = ctx.getBean("clientService", ClientService.class);
        ctx.registerShutdownHook();


    }
}
