package org.beanTest;


import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * bean 后置处理器的主要特性在于它会处理 IoC 容器中所有的 bean 实例，而不仅仅只是单个 bean 实例。
 * 通常，bean 后置处理器用于检查 bean 属性的有效性，根据特定标准修改 bean 属性，或者是对所有 bean 实例应用一些任务。
 * 编写 bean 后置处理器，类需要实现 BeanPostProcessor。
 */
@Component
public class MyBeanPostProcessor implements BeanPostProcessor {

    public MyBeanPostProcessor() {
        super();
        System.out.println("「BeanPostProcessor」3 BeanPostProcessor实现类构造器！！");
    }

    @Override
    public Object postProcessAfterInitialization(Object arg0, String arg1) throws BeansException {
        System.out.println("「BeanPostProcessor」13 BeanPostProcessor接口方法postProcessAfterInitialization对属性进行更改！");
        return arg0;
    }

    @Override
    public Object postProcessBeforeInitialization(Object arg0, String arg1) throws BeansException {
        System.out.println("「BeanPostProcessor」11 BeanPostProcessor接口方法postProcessBeforeInitialization对属性进行更改！");
        return arg0;
    }
}