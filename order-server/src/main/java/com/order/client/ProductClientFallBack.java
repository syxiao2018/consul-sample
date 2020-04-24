package com.order.client;

public class ProductClientFallBack implements ProductClient{
    @Override
    public String getProductInfo() {
        return "Error, fallback";
    }
}
