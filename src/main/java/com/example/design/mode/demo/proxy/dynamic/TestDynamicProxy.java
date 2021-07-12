package com.example.design.mode.demo.proxy.dynamic;

import com.example.design.mode.demo.proxy.statics.User;
import com.example.design.mode.demo.proxy.statics.UserInterfaceImpl;

/**
 * @author liuxiaojing
 * @description
 * @date 2021/7/7 上午10:54
 */
public class TestDynamicProxy {

    public static void main(String[] args) {
        //jdk动态代理
        testJDKProxy();

        //cglib接口代理
        testCglibInterfaceProxy();

        //cglib类代理
        testCglibClassProxy();
    }

    private static void testCglibClassProxy() {
        User user = new User();
        user.setUsername("tom");

        UserInterfaceImpl userImpl = (UserInterfaceImpl) ClassCgLibProxy.getUserProxy(new UserInterfaceImpl());
        userImpl.saveUser(user);
    }

    private static void testCglibInterfaceProxy() {
        User user = new User();
        user.setUsername("tom");
        UserCglibProxy.getUserProxy().saveUser(user);
    }

    private static void testJDKProxy() {
        User user = new User();
        user.setUsername("tom");
        UserProxy.getUserProxy().saveUser(user);

    }

}
