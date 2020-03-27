package com.bw.controller;

import com.bw.feign.HelloFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/client")

public class HelloController {
    @Autowired
    private HelloFeignClient helloFeignClient;
    @RequestMapping("/hello")
    public String hello(@RequestParam("name")String name){
        return helloFeignClient.hello(name);
    }
}
