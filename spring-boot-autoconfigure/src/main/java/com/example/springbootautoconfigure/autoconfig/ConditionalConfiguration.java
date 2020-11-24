package com.example.springbootautoconfigure.autoconfig;

import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnProperty(
        value = "module.enabled",
        havingValue = "true",
        matchIfMissing = true)
public class ConditionalConfiguration {

    @Bean
    @ConditionalOnProperty(
            value = "demo.bean.enabled",
            havingValue = "true",
            matchIfMissing = true)
    public DemoBean demoBean() {
        return new DemoBean();
    }

    @Bean
    @ConditionalOnBean(DemoBean.class)
    public HelloBean helloBean() {
        return new HelloBean();
    }

    static class HelloBean {
        HelloBean() {
            System.out.println("Hello Bean");
        }
    }
}
