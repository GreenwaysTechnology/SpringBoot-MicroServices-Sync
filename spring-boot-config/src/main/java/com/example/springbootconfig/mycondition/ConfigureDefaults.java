package com.example.springbootconfig.mycondition;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnClass({String.class})
public class ConfigureDefaults {
    Logger logger = LoggerFactory.getLogger(ConfigureDefaults.class);

    @Bean
    public String stringValue() {
        logger.info("Spring boot auto Configure Defaults");
        return new String("test");
    }
}