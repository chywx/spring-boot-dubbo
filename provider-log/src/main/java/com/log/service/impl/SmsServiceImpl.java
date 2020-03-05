package com.log.service.impl;

import org.apache.dubbo.config.annotation.Service;
import com.service.SmsService;

/**
 * 功能描述
 *
 * @author chy
 * @date 2019/10/23 0023
 */
@Service(version = "${dubbo.version}")
public class SmsServiceImpl implements SmsService {

    @Override
    public String sendMsg(String msg) {
        return "log project send msg is " + msg;
    }

    @Override
    public void sendMsgVoid(String msg) {
        System.out.println("sendMsgVoid log");
    }
}
