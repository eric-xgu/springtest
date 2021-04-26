package com.xugu.test;

import com.xugu.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static  void  main(String args[]){
        //获取spring上下文环境
        ApplicationContext ac=new ClassPathXmlApplicationContext("spring.xml");
        //通过id获取bean对象
        UserService userservce=(UserService) ac.getBean("userService");
        userservce.test();
        UserService userservce1=(UserService) ac.getBean("userService");
        userservce1.test();

    }
}
