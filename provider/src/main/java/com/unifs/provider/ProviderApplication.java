package com.unifs.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * @version V1.0
 * @title: com.unifs.provider.ProviderApplication
 * @projectName dubbodemoxml
 * @description: TODO
 * @author： 张恭雨
 * @date 2020/3/4 11:34
 */
@SpringBootApplication
@ImportResource({"classpath:dubbo-provider.xml"})
public class ProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProviderApplication.class, args);
    }
}
