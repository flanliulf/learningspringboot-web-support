package com.fancyliu.learningspringboot.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "custom")
@PropertySource(value = {"classpath:custom.properties"})
@Data
public class CustomProperties {

    private String author;
    private String blog;
    private String description;
}
