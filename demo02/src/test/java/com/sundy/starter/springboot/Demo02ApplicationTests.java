package com.sundy.starter.springboot;

import com.sundy.starter.springboot.bean.Person;
import com.sundy.starter.springboot.bean.Person2;
import com.sundy.starter.springboot.bean.Person3;
import com.sundy.starter.springboot.bean.Person4;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * 将配置文件中配置的每一个属性的值，映射到这个组件中
 * @ConfigurationProperties：告诉SpringBoot将本类中的所有属性和配置文件中相关的配置进行绑定；
 * prefix = "person"：配置文件中哪个下面的所有属性进行一一映射
 *
 * 只有这个组件是容器中的组件，才能容器提供的@ConfigurationProperties功能；
 * @ConfigurationProperties(prefix = "person")默认从全局配置文件中获取值；
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class Demo02ApplicationTests {


    @Autowired
    Person person;

    @Autowired
    Person2 person2;

    @Autowired
    Person3 person3;

    @Autowired
    Person4 person4;

    @Autowired
    ApplicationContext ioc;

    @Test
    public void testHelloService() {
        boolean b = ioc.containsBean("helloService02");
        System.out.println(b);
    }

    @Test
    public void contextLoads() {
        System.out.println(person);
    }

    @Test
    public void contextLoads2() {
        System.out.println(person2);
    }


    @Test
    public void contextLoads3() {
        System.out.println(person3);
    }

    @Test
    public void contextLoads4() {
        System.out.println(person4);
    }
}
