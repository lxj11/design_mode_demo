package com.example.design.mode.demo.factory;

/**
 * @author liuxiaojing
 * @description
 * @date 2021/7/7 下午5:18
 */
public class FactoryDemo {
    public static void main(String[] args) {
        BallFactory basketBallFactory = new BasketBallFactory();
        basketBallFactory.create();

        BallFactory soccerFactory = new SoccerFactory();
        soccerFactory.create();
    }
}
