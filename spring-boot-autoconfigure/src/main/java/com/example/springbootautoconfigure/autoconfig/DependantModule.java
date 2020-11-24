package com.example.springbootautoconfigure.autoconfig;

import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class DependantModule {

    @Bean
    OptionalBean optionalBean() {
        return new OptionalBean();
    }

    //load dependant bean only if OptionalBean is Present on classpath else dont.
    @Bean
    @ConditionalOnBean(OptionalBean.class)
    DependantBean dependantBean() {
        return new DependantBean();
    }

    static class DependantBean {
        DependantBean() {
            System.out.println("Dependantbean");
        }
    }

    static class OptionalBean {
        OptionalBean() {
           // System.out.println("OptionalBean");
        }
    }

}
