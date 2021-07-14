package com.example.design.mode.demo.abstr.factory;

/**
 * @author liuxiaojing
 * @description
 * @date 2021/7/14 下午4:01
 */
public class AbstrFactoryDemo {
    public static void main(String[] args) {
        AbstrBallFactory soccerFactory1 = new SoccerFactory1();
        soccerFactory1.createBall().create();
        soccerFactory1.createJournal().create();

        AbstrBallFactory basketballFactory2 = new BasketballFactory2();
        basketballFactory2.createBall().create();
        basketballFactory2.createJournal().create();

    }
}
