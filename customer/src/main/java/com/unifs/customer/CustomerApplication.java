package com.unifs.customer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * @version V1.0
 * @title: ProviderApplication
 * @projectName dubbodemoxml
 * @description: TODO
 * @author： 张恭雨
 * @date 2020/3/4 11:34
 */
@SpringBootApplication
@ImportResource({"classpath:dubbo-customer.xml"})
public class CustomerApplication {
    public static void main(String[] args) {
        SpringApplication.run(CustomerApplication.class, args);
        
    }
}
