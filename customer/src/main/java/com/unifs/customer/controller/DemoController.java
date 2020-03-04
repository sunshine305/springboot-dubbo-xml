package com.unifs.customer.controller;

import com.unifs.api.bean.User;
import com.unifs.api.service.DemoService;
import com.unifs.api.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @version V1.0
 * @title: DemoController
 * @projectName dubbodemoxml
 * @description: TODO
 * @author： 张恭雨
 * @date 2020/3/4 11:40
 */
@RestController
public class DemoController {

    //idea标红可忽略
    @Autowired
    private DemoService demoService;
    @Autowired
    private UserService userService;

    @GetMapping(value = "/test")
    public String test(String name) {
        return demoService.sayHello(name);
    }


    @GetMapping(value = "/register")
    public String register(User user) {
        //service调用传递对象，需要bean对象进行持久化
        boolean flag = userService.saveUser(user);
        if (flag) {
            return "注册成功！";
        } else {
            return "注册失败！";
        }
    }
}
