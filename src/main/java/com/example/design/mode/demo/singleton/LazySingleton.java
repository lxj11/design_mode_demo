package com.example.design.mode.demo.singleton;

/**
 * @author liuxiaojing
 * @description 懒汉式单例模式
 * @date 2021/7/13 下午7:52
 */
public class LazySingleton {
    private static LazySingleton instance = null;

    private LazySingleton() {
    }

    public static LazySingleton getInstance(){
        if(instance == null){
            instance = new LazySingleton();
        }
        return instance;
    }
}
