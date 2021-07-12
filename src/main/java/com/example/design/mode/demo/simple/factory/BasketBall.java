package com.example.design.mode.demo.simple.factory;

/**
 * @author liuxiaojing
 * @description
 * @date 2021/6/30 下午2:16
 */
public class BasketBall implements Ball {
    @Override
    public String create() {
        return "give you a basketBall";
    }
}
