package com.springmvc.test.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * JDK动态代理相关类，即拦截器
 */
public class TankDynamicProxy implements InvocationHandler {

    private Object object;

    public TankDynamicProxy(Object object){
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        long time = System.currentTimeMillis();
        Object result = method.invoke(object, args);
        long end = System.currentTimeMillis();
        System.out.println("执行方法" + method.getName() + ",耗时:" + (end - time) + "ms");
        return result;
    }
}
