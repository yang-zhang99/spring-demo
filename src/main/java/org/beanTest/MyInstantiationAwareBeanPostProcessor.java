package org.beanTest;


import org.springframework.beans.BeansException;
import org.springframework.beans.PropertyValues;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessorAdapter;
import org.springframework.stereotype.Component;

import java.beans.PropertyDescriptor;

/**
 * 可以提供实现某些“aware”接口来让 bean 能够感知到 Spring IoC 容器的资源。
 * 1.  aware 接口中的 setter 方法会被 Spring 所调用，调用时机是在所有 bean 属性都被设置完毕之后但初始化回调方法之前。
 * 2.  一旦类实现了 aware 接口，它们就会绑定到 Spring，在 Spring IoC 容器之外将无法正常使用。
 *
 *
 */
@Component
public class MyInstantiationAwareBeanPostProcessor extends InstantiationAwareBeanPostProcessorAdapter {

    public MyInstantiationAwareBeanPostProcessor() {
        super();
        System.out.println("「InstantiationAwareBeanPostProcessorAdapter」4 InstantiationAwareBeanPostProcessorAdapter实现类构造器！！");
    }

    // 接口方法、实例化Bean之前调用
    @Override
    public Object postProcessBeforeInstantiation(Class beanClass, String beanName) throws BeansException {
        System.out.println("「InstantiationAwareBeanPostProcessorAdapter」5 InstantiationAwareBeanPostProcessor调用postProcessBeforeInstantiation方法");
        return null;
    }

    // 接口方法、实例化Bean之后调用
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("「InstantiationAwareBeanPostProcessorAdapter」14 InstantiationAwareBeanPostProcessor调用postProcessAfterInitialization方法");
        return bean;
    }

    // 接口方法、设置某个属性时调用
    @Override
    public PropertyValues postProcessPropertyValues(PropertyValues pvs, PropertyDescriptor[] pds, Object bean, String beanName) throws BeansException {
        System.out.println("「InstantiationAwareBeanPostProcessorAdapter」7 调用postProcessPropertyValues方法");
        return pvs;
    }
}