package com.sundy.starter.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@ImportResource(locations ={"classpath:beans.xml"})
@SpringBootApplication
public class Demo02Application {
    public static void main(String[] args) {
        SpringApplication.run(Demo02Application.class, args);
    }
}
