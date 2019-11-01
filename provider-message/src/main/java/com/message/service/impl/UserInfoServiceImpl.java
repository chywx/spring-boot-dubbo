package com.message.service.impl;

import org.apache.dubbo.config.annotation.Service;
import com.entity.UserInfo;
import com.service.UserInfoService;

@Service(version = "${dubbo.version}")
public class UserInfoServiceImpl implements UserInfoService {
    @Override
    public UserInfo getUserInfo(Integer id) {
        UserInfo userInfo = new UserInfo();
        userInfo.setId(id);
        userInfo.setName("陈海洋");
        return userInfo;
    }
}
