package com.example.design.mode.demo.factory;

import com.example.design.mode.demo.simple.factory.Ball;
import com.example.design.mode.demo.simple.factory.Soccer;

/**
 * @author liuxiaojing
 * @description
 * @date 2021/6/30 下午2:36
 */
public class SoccerFactory implements BallFactory {
    @Override
    public Ball create() {
        //do something
        System.out.println("足球厂生产足球");
        return new Soccer();
    }
}
