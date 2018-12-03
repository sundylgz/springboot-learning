package com.sundy.starter.springboot.controller;

import com.sundy.starter.springboot.bean.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Value("${person.last-name}")
    private String name;
    @Autowired
    Person person;


    @RequestMapping("hello")
    @ResponseBody
    public String hello() {
        System.out.println(person);
        return "success";
    }
}
