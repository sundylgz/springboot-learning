package com.sundy.starter.demo03;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class Demo03Application {

    public static void main(String[] args) {

        SpringApplication.run(Demo03Application.class, args);
        log.debug("hhhhhhhhhhhhhh");
        log.warn("success!!!!");
    }
}
