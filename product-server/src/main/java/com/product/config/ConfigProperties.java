package com.product.config;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "product")
@Getter
@Setter
@ToString
@RefreshScope
public class ConfigProperties {
    private String catalogId;
    private Integer inventory;
}
