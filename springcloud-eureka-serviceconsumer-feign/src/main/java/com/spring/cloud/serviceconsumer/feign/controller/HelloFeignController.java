package com.spring.cloud.serviceconsumer.feign.controller;

import com.spring.cloud.serviceconsumer.feign.service.HelloFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloFeignController {

    @Autowired
    HelloFeignService helloFeignService;

    @RequestMapping("/")
    public String hi(String name) {
        //这里直接写的是服务名： springcloud-eureka-serviceprovider  。在ribbon中它会根据服务名来选择具体的服务实例，根据服务实例在请求的时候会用具体的url替换掉服务名
        return helloFeignService.hi(name);
    }
}
