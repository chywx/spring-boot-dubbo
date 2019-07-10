package com.log.service.impl;

import com.entity.ErrorLog;
import com.service.ErrorLogService;
import org.apache.dubbo.config.annotation.Service;

@Service(version = "${dubbo.version}")
public class ErrorLogServiceImpl implements ErrorLogService {
    @Override
    public String sendMsg(ErrorLog errorLog) {
        System.out.println("receive：" + errorLog);
        return "ok";
    }
}
