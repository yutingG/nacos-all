package com.dewi.consumer.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: guoyuting
 * @Date: Created at 2020/6/4 10:30 AM
 */
@Slf4j
@RestController
public class UserController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping(value = "consumerHello")
    public String consumerHello(@RequestParam(name = "name") String name) {
        String result = this.restTemplate.getForObject("http://nacos-provider/hello?name=" + name, String.class);
        log.info("Invoked consumerHello");
        return result;
    }
}
