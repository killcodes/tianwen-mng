package com.springmvc.context;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class SpringContextUtils implements ApplicationContextAware {

    private static ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    public static <T> T getBeanByName(String beanName){
        return (T)applicationContext.getBean(beanName);
    }


    public static <T> T getBeanByType(Class<T> clazz){
        return (T)applicationContext.getBean(clazz);
    }

}
