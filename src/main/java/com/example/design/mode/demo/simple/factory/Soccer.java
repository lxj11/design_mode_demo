package com.example.design.mode.demo.simple.factory;

/**
 * @author liuxiaojing
 * @description
 * @date 2021/6/30 下午2:15
 */
public class Soccer implements Ball{
    @Override
    public void create() {
        System.out.println("give you a soccer");
    }
}
