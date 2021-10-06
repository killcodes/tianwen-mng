package com.springmvc.test.dynamic.cglib;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * CGlib的拦截器
 */
public class Interceptor implements MethodInterceptor {

    private Object target;

    public Interceptor(Object target){
        this.target = target;
    }

    /**
     * 创建目标对象的代理对象
     *
     * @return
     */
    public Object createProxy() {
        // 代码增强
        // 该类用于生成代理对象
        Enhancer enhancer = new Enhancer();
        // 参数为拦截器
        enhancer.setCallback(this);
        // 设置父类
        enhancer.setSuperclass(target.getClass());
        // 创建代理对象
        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        long time = System.currentTimeMillis();
        Object result = method.invoke(target, objects);
        long end = System.currentTimeMillis();
        System.out.println("执行方法[" + method.getName() + "]耗时:" + (end - time) + "ms");
        return result;
    }
}
