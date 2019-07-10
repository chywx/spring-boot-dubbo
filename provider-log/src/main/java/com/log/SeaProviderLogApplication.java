package com.log;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubbo
public class SeaProviderLogApplication {

    public static void main(String[] args) {
        SpringApplication.run(SeaProviderLogApplication.class, args);
    }

}
