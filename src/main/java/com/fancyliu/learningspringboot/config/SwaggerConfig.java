package com.fancyliu.learningspringboot.config;

import com.sun.org.apache.bcel.internal.generic.NEW;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * 类描述:
 * Swagger2 配置类
 *
 * @author : Liu Fan
 * @date : 2019/11/7 16:07
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.fancyliu.learningspringboot.controller"))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("Spring Boot 集成 Swagger2 构建 RESTful APIs")
                .description("用户中心 API 接口文档 V1.0")
                .termsOfServiceUrl("http://blog.fancyliu.com")
                .version("1.0")
                .contact(new Contact("fancyliu","http://blog.fancyliu.com","flanliulf@gamil.com"))
                .build();
    }

}
