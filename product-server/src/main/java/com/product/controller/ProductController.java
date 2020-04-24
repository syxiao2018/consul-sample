package com.product.controller;

import com.product.config.ConfigProperties;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
@RequiredArgsConstructor
public class ProductController {
    @Value("${spring.application.name}")
    private String appName;
    @Value("${server.port}")
    private String port;

    private final ConfigProperties properties;

    @GetMapping
    public String getProducts() {

        return properties.toString() + " from: " + appName + ":" + port;
    }
}
