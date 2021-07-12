package com.example.design.mode.demo.proxy.statics;

/**
 * @author liuxiaojing
 * @description
 * @date 2021/7/7 上午10:30
 */
public class Demo {
    public static void main(String[] args) {
        User user = new User();
        user.setUsername("lxj");
        StaticProxy staticProxy = new StaticProxy(new UserInterfaceImpl());
        staticProxy.saveUser(user);
    }
}
