package com.order.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "product1", fallback = ProductClientFallBack.class)
public interface ProductClient {
    @GetMapping("/product")
    String getProductInfo();
}
