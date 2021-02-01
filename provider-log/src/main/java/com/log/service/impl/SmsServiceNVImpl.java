package com.log.service.impl;

import com.service.SmsService;
import org.apache.dubbo.config.annotation.Service;

/**
 * 功能描述
 *
 * @author chy
 * @date 2019/10/23 0023
 */
@Service
public class SmsServiceNVImpl implements SmsService {

    @Override
    public String sendMsg(String msg) {
        System.out.println("SmsServiceNVImpl");
        return "SmsServiceNVImpl project send msg is " + msg;
    }

    @Override
    public void sendMsgVoid(String msg) {
        System.out.println("sendMsgVoid log enter");
        int i = 1 / 0;
        System.out.println("sendMsgVoid log out");
    }
}
