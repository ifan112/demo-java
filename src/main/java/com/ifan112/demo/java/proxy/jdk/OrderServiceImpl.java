package com.ifan112.demo.java.proxy.jdk;

public class OrderServiceImpl implements OrderService {

    @Override
    public boolean newOrder(String username, long goodId) {
        System.out.println("用户名：" + username + "；商品：" + goodId);

        return true;
    }
}
