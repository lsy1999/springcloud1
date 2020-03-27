package com.bw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ServiceServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ServiceServerApplication.class,args);
    }
}
