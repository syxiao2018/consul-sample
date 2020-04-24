package com.order;

import com.order.client.ProductClient;
import com.order.client.TestConfigProperty;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/order")
public class OrderController {
    private final ProductClient productClient;

    @Value("${spring.application.name}")
    private String appName;

    @Autowired
    private TestConfigProperty property;

    @PostMapping
    public ResponseEntity<String> create() {
        // ...
        // 查询产品信息
        String product = productClient.getProductInfo();

        return ResponseEntity.ok(appName + ": " + product);
    }

    @GetMapping
    public String test() {
        return property.getVal();
    }
}
