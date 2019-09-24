package com.spring.cloud.serviceconsumer.feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient //启用EurekaClient组件
@EnableFeignClients  //开启Feign的功能
public class FeignApp {
    public static void main(String[] args) {
        SpringApplication.run(FeignApp.class, args);
    }
}
