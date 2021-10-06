package com.springmvc.test.dynamic;

import com.springmvc.test.dynamic.cglib.Interceptor;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Test {
    public static void main(String[] args){
//        Subject tank = new Tank();
//        TankProxy tankProxy = new TankProxy(tank);
//        tankProxy.move();

//        InvocationHandler handler = new TankDynamicProxy(tank);
//        Subject subject =  (Subject) Proxy.newProxyInstance(handler.getClass().getClassLoader(), tank.getClass().getInterfaces(), handler);
//        subject.move();

        //cglib
        Tank2 tank = new Tank2();
        Interceptor interceptor = new Interceptor(tank);
        Tank2 tank2 = (Tank2)interceptor.createProxy();
        tank2.move();
    }

}
