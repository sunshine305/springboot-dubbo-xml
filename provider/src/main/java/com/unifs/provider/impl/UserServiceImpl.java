package com.unifs.provider.impl;

import com.unifs.api.bean.User;
import com.unifs.api.service.UserService;

/**
 * @version V1.0
 * @title: UserServiceImpl
 * @projectName dubbodemoxml
 * @description: TODO
 * @author： 张恭雨
 * @date 2020/3/4 14:56
 */
public class UserServiceImpl implements UserService {
    @Override
    public boolean saveUser(User user) {
        if (user == null) {
            return false;
        }
        System.out.println(user.getAge());
        System.out.println(user.getName());
        return true;
    }
}
