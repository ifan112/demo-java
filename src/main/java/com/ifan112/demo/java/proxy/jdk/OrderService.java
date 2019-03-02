package com.ifan112.demo.java.proxy.jdk;

public interface OrderService {

    /**
     * 创建订单
     *
     * @param username  用户名
     * @param goodId    商品ID
     *
     * @return true，订单创建成功。否则，创建失败
     */
    boolean newOrder(String username, long goodId);
}
