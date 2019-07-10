package com.message.service.impl;

import com.entity.UserInfo;
import com.service.UserInfoService;
import org.apache.dubbo.config.annotation.Service;

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
