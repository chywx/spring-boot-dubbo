package com.service;

import com.entity.ErrorLog;

public interface ErrorLogService {

    String sendMsg(ErrorLog errorLog);

    void asyncSendMsg(ErrorLog errorLog);
}
