package com.bw.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "service-server")
public interface HelloFeignClient {

    @RequestMapping("/server/hello")
    String hello(@RequestParam("name") String name);
}
