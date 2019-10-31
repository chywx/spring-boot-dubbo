package com.web.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.service.SmsService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 功能描述
 *
 * @author chy
 * @date 2019/10/23 0023
 */
@RestController
@RequestMapping("/msg")
public class MsgController {

    @Reference(version = "1.0.1",check = false)
    SmsService smsServiceLog;

    @Reference(version = "1.0.0")
    SmsService smsServiceMessage;

    @RequestMapping("/send1")
    public String send1() {
        return smsServiceLog.sendMsg("hello");
    }

    @RequestMapping("/send2")
    public String send2() {
        return smsServiceMessage.sendMsg("world");
    }

}
