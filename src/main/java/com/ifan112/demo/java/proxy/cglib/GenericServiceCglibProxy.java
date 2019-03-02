package com.ifan112.demo.java.proxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * 基于CGLIB的通用代理
 *
 * @param <T> 代理目标类的类型
 */

public class GenericServiceCglibProxy<T> implements MethodInterceptor {

    private Enhancer enhancer;

    public GenericServiceCglibProxy(Class<T> targetClass) {
        enhancer = new Enhancer();
        enhancer.setSuperclass(targetClass);
        enhancer.setCallback(this);
    }

    @SuppressWarnings("unchecked")
    public T getProxy() {
        return (T) enhancer.create();
    }

    @Override
    public Object intercept(Object target, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        System.out.println("~~~~~~~~~~ 通用代理开始 ~~~~~~~~~~");

        Object result = methodProxy.invokeSuper(target, args);
        System.out.println("执行方法：" + method.getName() + "；参数：" + Arrays.toString(args));

        System.out.println("~~~~~~~~~~ 通用代理结束 ~~~~~~~~~~");

        // 返回结果
        return result;
    }
}
