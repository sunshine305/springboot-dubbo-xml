package com.unifs.api.bean;

import java.io.Serializable;

/**
 * @version V1.0
 * @title: User
 * @projectName dubbodemoxml
 * @description: 实体类RPC对象，需要持久化
 * @author： 张恭雨
 * @date 2020/3/4 14:54
 */
public class User implements Serializable {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
