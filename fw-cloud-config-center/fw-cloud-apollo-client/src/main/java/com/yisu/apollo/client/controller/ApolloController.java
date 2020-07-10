package com.yisu.apollo.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xuyisu
 * @description
 * @date 2019/12/26
 */
@RestController
@RequestMapping("/config")
public class ApolloController {

    @Value("${fwcloud.config.name:test}")
    private String configName;

    @RequestMapping("/get")
    public String get() {
        return configName;
    }
}
