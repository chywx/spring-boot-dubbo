package com.log.service.impl;

import org.apache.dubbo.config.annotation.Service;
import com.entity.ErrorLog;
import com.service.ErrorLogService;
import java.util.concurrent.TimeUnit;

@Service(version = "${dubbo.version}",async = false)
public class ErrorLogServiceImpl implements ErrorLogService {
    @Override
    public String sendMsg(ErrorLog errorLog) {
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("receive：" + errorLog);
        return "ok";
    }

    @Override
    public void asyncSendMsg(ErrorLog errorLog) {
        System.out.println("asyncSendMsg");
    }
}
