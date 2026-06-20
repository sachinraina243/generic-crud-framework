package com.myappservices.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.myappservices.app")
public class GenericCrudFrameworksApplication {

    public static void main(String[] args) {
        SpringApplication.run(GenericCrudFrameworksApplication.class, args);
    }
}
