package com.example.design.mode.demo.simple.factory;

/**
 * @author liuxiaojing
 * @description
 * @date 2021/6/30 下午2:17
 */
public class SimpleBallFactory {

    public static Ball createBall(String name) {
        if (name.equals("basketBall")) {
            return new BasketBall();
        } else if (name.equals("soccer")) {
            return new Soccer();
        } else {
            return null;
        }
    }

    public static void main(String[] args) {
        Ball basketBall = SimpleBallFactory.createBall("basketBall");
        Ball soccer = SimpleBallFactory.createBall("soccer");
        System.out.println(basketBall.create());
        System.out.println(soccer.create());

    }
}
