package com.ifan112.demo.java.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

public class NoImplementedServiceJdkProxy<T> implements InvocationHandler {

    private Class<T> target;

    public NoImplementedServiceJdkProxy(Class<T> target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) {
        System.out.println("~~~~~~~~~~ 代理开始 ~~~~~~~~~~");

        System.out.println("被调用的方法：" + method.getName());
        System.out.println("方法参数：" + Arrays.toString(args));

        System.out.println("~~~~~~~~~~ 代理结束 ~~~~~~~~~~");

        // 返回结果
        return true;
    }

    @SuppressWarnings("unchecked")
    public T getServiceProxy() {
        return (T) Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(), new Class[]{target}, this);
    }
}
