package com.example.springbootconfig.mycondition;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OnMissingBeanModule {
    @Bean
    @ConditionalOnMissingBean
    InMemoryDataSource dataSource() {
        return new InMemoryDataSource();
    }

    static class InMemoryDataSource {
        public InMemoryDataSource() {
            System.out.println("InMemoryDataSource");
        }
    }
}
