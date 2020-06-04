package com.dewi.config.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: guoyuting
 * @Date: Created at 2020/6/4 11:11 AM
 */
@Slf4j
@RestController
@RefreshScope
public class ConfigController {

    @Value("${author.name}")
    private String authorName;

    @GetMapping(value = "/getAuthor")
    public String getAuthorName() {
        return authorName;
    }
}
