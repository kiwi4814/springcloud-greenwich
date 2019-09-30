package com.spring.cloud.config.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloConfigController {
    //属性注入
    @Value("${name}")
    String name;

    @RequestMapping(value = "/hi")
    public String hi() {
        return "hi " + name;
    }
}