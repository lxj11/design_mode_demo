package com.example.design.mode.demo.proxy.dynamic;

import com.example.design.mode.demo.proxy.statics.UserInterface;
import com.example.design.mode.demo.proxy.statics.UserInterfaceImpl;
import org.springframework.cglib.proxy.InvocationHandler;
import org.springframework.cglib.proxy.Proxy;

import java.lang.reflect.Method;

/**
 * @author liuxiaojing
 * @description
 * @date 2021/7/7 下午2:21
 */
public class UserCglibProxy {

    private static final InvocationHandler USER_HANDLE = new InvocationHandler() {

        @Override

        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

            System.out.println("Cglib接口动态代理-开始保存用户");

            Object result = method.invoke(new UserInterfaceImpl(), args);

            System.out.println("Cglib接口动态代理-保存用户结果: " + result);

            System.out.println();

            return result;

        }

    };

    public static UserInterface getUserProxy() {

        UserInterface userInterface = (UserInterface) Proxy.newProxyInstance(

                UserCglibProxy.class.getClassLoader(), new Class[]{UserInterface.class}, USER_HANDLE);

        return userInterface;

    }


}
