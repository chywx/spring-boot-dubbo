package com.message.service.impl;

import com.service.SmsService;
import org.apache.dubbo.config.annotation.Service;

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
        return "message project send msg is " + msg;
    }
}
