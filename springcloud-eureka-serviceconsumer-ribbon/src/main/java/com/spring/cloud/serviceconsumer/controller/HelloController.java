package com.spring.cloud.serviceconsumer.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HelloController {

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping("/")
    @HystrixCommand(fallbackMethod = "hiFallBack") //这个名字是方法名，需要在下面定义
    public String hi(String name) {
        //这里直接写的是服务名： springcloud-eureka-serviceprovider  。在ribbon中它会根据服务名来选择具体的服务实例，根据服务实例在请求的时候会用具体的url替换掉服务名
        return restTemplate.getForObject("http://springcloud-eureka-serviceprovider?name=" + name, String.class);
    }

    //hiFallBack的方法声明要与上面hi的声明一致
    public String hiFallBack(String name) {
        return " fall back. " + name;
    }
}