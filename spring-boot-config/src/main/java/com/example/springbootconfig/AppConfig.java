package com.example.springbootconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class AppConfig {

    @Bean
    @Profile(value = "prod")
    public Greeter getDataSourceProd() {
        System.out.println("Production Mode");
        return new Greeter("prod");
    }

    @Bean
    @Profile(value = "test")
    public Greeter getDataSourceTest() {
        System.out.println("Test Mode");
        return new Greeter("test");
    }

    @Bean
    @Profile(value = "dev")
    public Greeter getDataSourceDev() {
        System.out.println("Dev Mode");
        return new Greeter("dev");
    }
}
