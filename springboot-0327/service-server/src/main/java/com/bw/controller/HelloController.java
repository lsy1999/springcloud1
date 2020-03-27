package com.bw.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/server")
public class HelloController {
    @RequestMapping("/hello")
    public String hello(@RequestParam("name")String name){
        return name+":这个服务来自server";
    }
}
