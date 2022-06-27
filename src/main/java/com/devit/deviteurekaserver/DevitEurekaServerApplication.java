package com.devit.deviteurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class DevitEurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(DevitEurekaServerApplication.class, args);
    }

}
