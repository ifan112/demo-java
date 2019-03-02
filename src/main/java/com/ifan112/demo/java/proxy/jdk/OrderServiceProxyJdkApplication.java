package com.ifan112.demo.java.proxy.jdk;

import java.lang.reflect.Proxy;

public class OrderServiceProxyJdkApplication {

    public static void main(String[] args) {

        // 将生成的代理类保存到文件中
        // System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");

        OrderService target = new OrderServiceImpl();

        // 对orderServiceProxy这个代理对象的任何方法调用，都会被转发OrderServiceProxy.invoke()
        OrderService orderServiceProxy = new OrderServiceJdkProxy(target).getProxy();

        // OrderService orderServiceProxy = new GenericServiceProxy<OrderService>(target).getProxy();

        System.out.println("orderServiceProxy是代理类：" + (Proxy.isProxyClass(orderServiceProxy.getClass())));


        boolean result = orderServiceProxy.newOrder("用户名", 1000);
        System.out.println("执行结果：" + result);

    }
}
