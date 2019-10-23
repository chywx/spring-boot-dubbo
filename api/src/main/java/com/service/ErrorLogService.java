package com.service;

import com.entity.ErrorLog;

public interface ErrorLogService {

    public String sendMsg(ErrorLog errorLog);

    void asyncSendMsg(ErrorLog errorLog);
}
