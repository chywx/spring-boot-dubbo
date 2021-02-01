package com.service.impl;

import com.entity.Hello;
import com.service.HelloService;
import java.util.HashSet;
import org.apache.dubbo.config.annotation.Service;

/**
 * 短信接口
 *
 * @author chy
 * @date 2019/10/23 0023
 */
@Service
public class HelloServiceImpl implements HelloService {


    @Override
    public Hello getData() {
        Hello hello = new Hello();

        HashSet<String> strings = new HashSet<>();
        strings.add("chy");
        strings.add("xxp");
        strings.add("chy");

        hello.setNames(strings);
        return hello;
    }
}
