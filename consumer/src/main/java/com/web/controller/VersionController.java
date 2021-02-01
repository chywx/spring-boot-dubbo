package com.web.controller;

import com.service.SmsService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

;

/**
 * 功能描述
 *
 * @author chy
 * @date 2019/10/23 0023
 */
@RestController
@RequestMapping("/msg")
public class VersionController {

    @Reference(version = "1.0.1:*")
    SmsService Aaa;

    @Reference(version = "1.0.0")
    SmsService Bbb;

    @Reference(version = "*")
    SmsService Ccc;

    @Reference
    SmsService Ddd;

    @GetMapping("/aaa")
    public String send1() {
        String hello = Aaa.sendMsg("aaa");
        System.out.println("aaa:" + hello);
        return hello;
    }

    @GetMapping("/bbb")
    public String send2() {
        String hello = Bbb.sendMsg("bbb");
        System.out.println("bbb:" + hello);
        return hello;
    }

    @GetMapping("/ccc")
    public String send3() {
        String hello = Ccc.sendMsg("ccc");
        System.out.println("ccc:" + hello);
        return hello;
    }

    @GetMapping("/ddd")
    public String send4() {
        String hello = Ddd.sendMsg("ddd");
        System.out.println("ddd:" + hello);
        return hello;
    }

}
