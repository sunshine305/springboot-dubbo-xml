package com.unifs.customer.controller;

import com.unifs.api.service.DemoService;
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

    @GetMapping(value = "/test")
    public String test(String name) {
        return demoService.sayHello(name);
    }
}
