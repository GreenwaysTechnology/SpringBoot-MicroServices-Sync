package com.example.springbootautoconfigure;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@EnableAutoConfiguration
//@ComponentScan
public class SpringBootAutoconfigureApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootAutoconfigureApplication.class, args);
	}

}
