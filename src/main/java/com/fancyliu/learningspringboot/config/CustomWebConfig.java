package com.fancyliu.learningspringboot.config;

import com.fancyliu.learningspringboot.filter.CustomFilter;
import com.fancyliu.learningspringboot.filter.CustomFilter2;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CustomWebConfig {

    @Bean
    public FilterRegistrationBean testFilterRegistration() {
        FilterRegistrationBean registration = new FilterRegistrationBean();
        registration.setFilter(new CustomFilter());
        registration.addUrlPatterns("/*");
        registration.setName("CustomFilter");
        registration.setOrder(6);
        return registration;
    }

    @Bean
    public FilterRegistrationBean testFilterRegistration2() {
        FilterRegistrationBean registration = new FilterRegistrationBean();
        registration.setFilter(new CustomFilter2());
        registration.addUrlPatterns("/*");
        registration.setName("CustomFilter 2");
        registration.setOrder(1);
        return registration;
    }
}
