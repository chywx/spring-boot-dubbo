package com.web.controller;

import com.entity.ErrorLog;
import com.service.ErrorLogService;
import com.service.UserInfoService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @Reference(version = "1.0.0",check = false)
    private UserInfoService userInfoService;

    @Reference(version = "1.0.1",check = false)
    private ErrorLogService errorLogService;

    @RequestMapping("aaa")
    public String aaa(){
        System.out.println(userInfoService.getUserInfo(1));
        return "aaa";
    }

    @RequestMapping("bbb")
    public String bbb(){
        ErrorLog errorLog = new ErrorLog();
        errorLog.setName("error");
        System.out.println(errorLogService.sendMsg(errorLog));
        return "bbb";
    }



}
