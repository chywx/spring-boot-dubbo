package com.web;

import com.entity.ErrorLog;
import com.service.ErrorLogService;
import com.service.UserInfoService;
import org.apache.dubbo.config.annotation.Reference;
import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDubbo
public class SeaWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(SeaWebApplication.class, args);
    }
}
