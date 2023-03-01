package org.beanTest;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;


public class BeanLifeCycle {

    public static void main(String[] args) {

        System.out.println("「开始」开始初始化容器!");

        AnnotationConfigApplicationContext factory = new AnnotationConfigApplicationContext("org.beanTest");

        System.out.println("容器初始化成功!");

        //得到Preson，并使用
        Person person = factory.getBean("person", Person.class);
        System.out.println(person);
        World world = factory.getBean("world", World.class);
        System.out.println(world);

        System.out.println("现在开始关闭容器！");
        factory.registerShutdownHook();
    }
}