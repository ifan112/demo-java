package com.ifan112.demo.java.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class OrderServiceJdkProxy implements InvocationHandler {

    /**
     * 被代理对象
     */
    private OrderService target;

    public OrderServiceJdkProxy(OrderService target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("~~~~~~~~~~ 代理开始 ~~~~~~~~~~");

        // 在被代理对象上
        Object result = method.invoke(target, args);

        System.out.println("~~~~~~~~~~ 代理结束 ~~~~~~~~~~");

        return result;
    }

    public OrderService getProxy() {
        return (OrderService) Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(), new Class[]{OrderService.class}, this);
    }

}
