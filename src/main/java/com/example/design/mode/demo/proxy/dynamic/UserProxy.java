package com.example.design.mode.demo.proxy.dynamic;

import com.example.design.mode.demo.proxy.statics.UserInterface;
import com.example.design.mode.demo.proxy.statics.UserInterfaceImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author liuxiaojing
 * @description
 * @date 2021/7/7 上午10:57
 */
public class UserProxy {
    private static final InvocationHandler USER_HANDLE = new InvocationHandler() {
        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            System.out.println("jdk接口动态代理-开始保存用户");
            Object result = method.invoke(new UserInterfaceImpl(), args);
            System.out.println("jdk接口动态代理-保存用户结果：" +result);
            System.out.println();
            return result;
        }
    };

    public static UserInterface getUserProxy(){
        UserInterface userInterface = (UserInterface) Proxy.newProxyInstance(UserProxy.class.getClassLoader(), new Class[]{UserInterface.class}, USER_HANDLE);
        return userInterface;
    }
}
