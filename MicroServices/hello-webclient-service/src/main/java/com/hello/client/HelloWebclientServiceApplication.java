package com.hello.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class HelloWebclientServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloWebclientServiceApplication.class, args);
	}

}
