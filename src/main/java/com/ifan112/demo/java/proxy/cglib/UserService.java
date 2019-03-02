package com.ifan112.demo.java.proxy.cglib;

public class UserService {

    public User newUser(String username, int age) {
        User user = new User();
        user.setName(username);
        user.setAge(age);

        return user;
    }
}
