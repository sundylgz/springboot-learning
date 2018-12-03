package com.sundy.starter.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
@MapperScan(value = "com.sundy.springboot.mapper")
public class Demo08Application {
    public static void main(String[] args) {
        SpringApplication.run(Demo08Application.class, args);
    }
}
