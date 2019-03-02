package com.ifan112.demo.java.proxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * 基于CGLIB的UserService代理类
 */

public class UserServiceCglibProxy implements MethodInterceptor {

    private Enhancer enhancer;

    public UserServiceCglibProxy(Class<?> targetClass) {
        enhancer = new Enhancer();
        enhancer.setSuperclass(targetClass);
        enhancer.setCallback(this);
    }

    public UserService getProxy() {
        return (UserService) enhancer.create();
    }

    @Override
    public Object intercept(Object target, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        System.out.println("~~~~~~~~~~ 用户服务代理开始 ~~~~~~~~~~");

        Object result = methodProxy.invokeSuper(target, args);
        System.out.println("执行方法：" + method.getName() + "；参数：" + Arrays.toString(args));

        System.out.println("~~~~~~~~~~ 用户服务代理结束 ~~~~~~~~~~");

        // 返回结果
        return result;
    }
}
