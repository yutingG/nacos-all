package com.dewi.provider.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: guoyuting
 * @Date: Created at 2020/6/4 8:31 AM
 */
@Slf4j
@RestController
public class UserController {

    @GetMapping("/hello")
    public String hello(@RequestParam(name = "name") String name) {
        log.info("Invoked hello() : " + name);
        return "hello, " + name;
    }
}
