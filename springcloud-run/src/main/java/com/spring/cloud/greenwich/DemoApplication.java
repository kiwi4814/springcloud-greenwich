package com.spring.cloud.greenwich;

import com.spring.cloud.server.ServerApp;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer //启用EurekaServer
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServerApp.class, args);
    }

}
