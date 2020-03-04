package com.unifs.provider.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.unifs.api.service.DemoService;
import org.springframework.stereotype.Component;

/**
 * @version V1.0
 * @title: DemoServiceImpl
 * @projectName dubbodemoxml
 * @description: RPC远程接口实现
 * @author： 张恭雨
 * @date 2020/3/4 11:16
 */

public class DemoServiceImpl implements DemoService {
    public String sayHello(String name) {
        return "你好：" + name;
    }
}
