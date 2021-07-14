package com.example.design.mode.demo.singleton;

/**
 * @author liuxiaojing
 * @description 饿汉式单例模式
 * @date 2021/7/13 下午7:50
 */
public class HungrySingleton {
    private  static HungrySingleton singleton = new HungrySingleton();

    private HungrySingleton(){}

    public static HungrySingleton getInstance(){
        return singleton;
    }

}
