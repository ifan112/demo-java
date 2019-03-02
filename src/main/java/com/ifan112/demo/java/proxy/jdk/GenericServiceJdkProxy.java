package com.ifan112.demo.java.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 通用的代理
 *
 * @param <T> 被代理的接口
 */
public class GenericServiceJdkProxy<T> implements InvocationHandler {

    /**
     * 被代理目标，通常是被代理接口T的实现类。
     */
    private Object target;

    public GenericServiceJdkProxy(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("~~~~~~~~~~ 代理开始 ~~~~~~~~~~");

        // 执行被代理对象内有关被调用方法的真实逻辑
        Object result = method.invoke(target, args);

        System.out.println("~~~~~~~~~~ 代理结束 ~~~~~~~~~~");

        return result;
    }

    /**
     * 获取对被代理目标的代理类
     *
     * @return 被代理目标的代理类
     */
    @SuppressWarnings("unchecked")
    public T getProxy() {
        return (T) Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(), target.getClass().getInterfaces(), this);
    }
}
