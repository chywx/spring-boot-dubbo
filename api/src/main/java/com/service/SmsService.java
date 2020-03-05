package com.service;

/**
 * 短信接口
 *
 * @author chy
 * @date 2019/10/23 0023
 */
public interface SmsService {

    String sendMsg(String msg);

    void sendMsgVoid(String msg);

}
