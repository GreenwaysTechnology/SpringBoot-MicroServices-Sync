package com.example.demo.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * beans.xml
 * <?xml version="1.0" encoding="UTF-8"?>
 * <beans xmlns="http://www.springframework.org/schema/beans"
 * xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
 * xsi:schemaLocation="http://www.springframework.org/schema/beans
 * http://www.springframework.org/schema/beans/spring-beans.xsd">
 *
 * </beans>
 * beans - @Configuration
 * <beans>
 * <bean name="customerService" class="com.ae.spring.service.impl.CustomerServiceImpl"/>
 * </beans>
 * <bean> -  @Bean
 * Add stro type scnner to activate bean creations
 *   <context:component-scan base-package="com.example.demo"/> ==@ComponentScan(basePackages = "com.example.demo.javaconfig")
 */

@Configuration
@ComponentScan(basePackages = "com.example.demo.javaconfig")
public class AppConfig {
    @Bean
    public HelloWorld helloWorld() {
        return new HelloWorld();
    }
}
