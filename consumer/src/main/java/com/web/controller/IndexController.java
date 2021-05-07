package com.web.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import org.apache.dubbo.config.annotation.Reference;;
import com.entity.ErrorLog;
import com.service.ErrorLogService;
import com.service.UserInfoService;
import org.apache.dubbo.rpc.RpcContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @Reference(version = "1.0.0", check = false)
    private UserInfoService userInfoService;

    @Reference(version = "1.0.1", check = false, async = true)
    private ErrorLogService errorLogService;

    @GetMapping("/aaa")
    public String aaa() {
        System.out.println(userInfoService.getUserInfo(1));
        return "aaa";
    }

    @GetMapping("/bbb")
    public String bbb() throws ExecutionException, InterruptedException {
        System.out.println("enter bbb");

        List<CompletableFuture> list = new ArrayList<>();

        String result = errorLogService.sendMsg(new ErrorLog().setName("error"));
        // 异步调用，肯定为null
        System.out.println("result:" + result);

        list.add(RpcContext.getContext().getCompletableFuture());
        Object o = RpcContext.getContext().getFuture().get();
        System.out.println(o);

        String result2 = errorLogService.sendMsg(new ErrorLog().setName("error2"));
        System.out.println("result2:" + result2);

        list.add(RpcContext.getContext().getCompletableFuture());
        Object o2 = RpcContext.getContext().getFuture().get();
        System.out.println(o2);

        for (CompletableFuture completableFuture : list) {
            Object oo = completableFuture.get();
            System.out.println("completableFuture:" + oo);
        }
        return "bbb";
    }

    @GetMapping("/ccc")
    public void ccc() {
        ErrorLog errorLog = new ErrorLog();
        errorLog.setName("dahai");
        errorLogService.asyncSendMsg(errorLog);
        System.out.println(123);
    }


}
