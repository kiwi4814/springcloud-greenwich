package com.spring.cloud.serviceconsumer.feign.service.impl;

import com.spring.cloud.serviceconsumer.feign.service.HelloFeignService;
import org.springframework.stereotype.Component;

/**
 * Hystrix的fallback配置
 */
@Component
public class HelloServiceHystrix implements HelloFeignService {

    /**
     * 这里方法声明要与HelloService中的一致
     *
     * @param name
     * @return
     */
    @Override
    public String hi(String name) {
        return " fall back. " + name;
    }
}