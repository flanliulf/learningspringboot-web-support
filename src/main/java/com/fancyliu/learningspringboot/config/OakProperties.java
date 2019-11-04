package com.fancyliu.learningspringboot.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "oak")
@Data
public class OakProperties {

    private String author;
    private String title;
    private String description;
}
