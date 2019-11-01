package com.log;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@EnableDubbo
public class SeaProviderLogApplication  {
//public class SeaProviderLogApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SeaProviderLogApplication.class, args);
    }


//    @Override
//    public void run(String... args) throws Exception {
//        System.out.println("SeaProviderLogApplication正在启动。。。");
//        while(true) {
//            Thread.sleep(600000000);
//            System.out.println("sleep....");
//        }
//    }
}
