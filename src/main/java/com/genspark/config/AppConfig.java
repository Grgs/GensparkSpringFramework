package com.genspark.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public Printable getPrintable(){
        return new Student();
    }
}
