package com.example.springbootconfig.mycondition;

import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnProperty(
        value="module.enabled",
        havingValue = "true",
        matchIfMissing = true)
public class ConditionalConfiguration {
    @Bean
    public DemoBean demoBean() {
        return new DemoBean();
    }

    @Bean
    public HelloBean helloBean() {
        return new HelloBean();
    }


}
