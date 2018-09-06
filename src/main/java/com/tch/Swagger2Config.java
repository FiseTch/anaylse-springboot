package com.tch;

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
 * @author Tongch
 * @version 1.0
 * @time 2018/9/4 16:38
 */

@Configuration
@EnableSwagger2
public class Swagger2Config {
    
    @Bean
    public Docket createApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(setApiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.tch.controller"))
                .paths(PathSelectors.any())
                .build();
    }
    
    private ApiInfo setApiInfo() {
        return new ApiInfoBuilder()
                .title("同学录信息录入")
                .description("同学录系统的开发")
                .contact(new Contact("Tong", "", "fise-t@qq.com"))
                .version("1.0")
                .build();
    }
}
