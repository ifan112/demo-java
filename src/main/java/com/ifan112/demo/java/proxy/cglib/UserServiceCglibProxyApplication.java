package com.ifan112.demo.java.proxy.cglib;

import net.sf.cglib.proxy.Factory;

public class UserServiceCglibProxyApplication {

    public static void main(String[] args) {
        // 保存CGLIB生成的class文件
        // System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY, "./src/main/java/");

        // UserService userServiceProxy = new UserServiceProxy(UserService.class).getProxy();

        UserService userServiceProxy = new GenericServiceCglibProxy<>(UserService.class).getProxy();

        System.out.println("userServiceProxy是CGLIB Factory的子类：" + (userServiceProxy instanceof Factory));

        User user = userServiceProxy.newUser("用户名", 22);
        System.out.println("执行结果：" + user);

    }

}
