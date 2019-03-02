package com.ifan112.demo.java.proxy.jdk;

public class NoImplementedServiceProxyJdkApplication {

    public static void main(String[] args) {
        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");

        // NoImplementedServiceProxy并没有代理任何的OrderService实现
        // 它将会根据方法名称，执行响应的逻辑。这里只是简单的输出方法名称和参数列表。

        OrderService orderService = new NoImplementedServiceJdkProxy<>(OrderService.class).getServiceProxy();

        // 这也是Mybatis对Mapper接口的实现逻辑。
        // 通过动态代理，生成一个接口的代理类，当调用接口的方法时，会转发给该代理类来执行。
        // 代理类得到要代理的接口类型和执行的方法名称，查找该接口和方法对应的SQL语句，然后执行，最后返回执行结果。

        boolean result = orderService.newOrder("用户名", 11111);
        System.out.println("执行结果：" + result);

    }
}
