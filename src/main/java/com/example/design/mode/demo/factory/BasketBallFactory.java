package com.example.design.mode.demo.factory;

import com.example.design.mode.demo.simple.factory.Ball;
import com.example.design.mode.demo.simple.factory.BasketBall;

/**
 * @author liuxiaojing
 * @description
 * @date 2021/6/30 下午2:37
 */
public class BasketBallFactory implements BallFactory {
    @Override
    public Ball create() {
        //do something
        System.out.println("篮球厂生产篮球");
        return new BasketBall();
    }
}
