package com.web.controller;/**
 * @author chy
 * @date 2021/2/1 0001 上午 11:49
 * Description：
 */

import com.entity.Hello;
import com.service.HelloService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 功能描述
 *
 * @author chy
 * @date 2021/2/1 0001
 */
@RestController
public class HelloController {

    @Reference(check = false)
    private HelloService helloService;

    @GetMapping("/hello")
    public String aaa() {
        Hello data = helloService.getData();
        System.out.println(data);
        return "hello";
    }

}
