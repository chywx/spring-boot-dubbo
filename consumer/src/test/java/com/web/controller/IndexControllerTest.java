package com.web.controller;

import org.apache.dubbo.config.annotation.Reference;;
import com.entity.ErrorLog;
import com.service.ErrorLogService;
import com.service.UserInfoService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class IndexControllerTest {


    @Reference(version = "1.0.0",check = false)
    private UserInfoService userInfoService;

    @Test
    public void aaa(){
        System.out.println(userInfoService.getUserInfo(1));
    }




    @Reference(version = "1.0.1")
    private ErrorLogService errorLogService;

    @Test
    public void bbb() {
        ErrorLog errorLog = new ErrorLog();
        errorLog.setName("error");
        System.out.println(errorLogService.sendMsg(errorLog));
        System.out.println(123);
    }


    @Test
    public void ccc(){
        ErrorLog errorLog = new ErrorLog();
        errorLog.setName("dahai");
        errorLogService.asyncSendMsg(errorLog);
        System.out.println(123);
    }




}