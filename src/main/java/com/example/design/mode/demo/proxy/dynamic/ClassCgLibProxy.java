package com.example.design.mode.demo.proxy.dynamic;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author liuxiaojing
 * @description
 * @date 2021/7/7 下午3:23
 */
public class ClassCgLibProxy {

    private static final MethodInterceptor USER_HANDLE = new MethodInterceptor() {



        @Override

        public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {

            System.out.println("Cglib类动态代理-开始保存用户");

            Object result = proxy.invokeSuper(obj, args);

            System.out.println("Cglib类动态代理-保存用户结果: " + result);

            System.out.println();

            return result;

        }

    };



    public static Object getUserProxy(Object target) {

        Enhancer enhancer = new Enhancer();

        enhancer.setSuperclass(target.getClass());

        enhancer.setCallback(USER_HANDLE);

        return enhancer.create();

    }

}

