package com.example.design.mode.demo.bridge;

import com.example.design.mode.demo.simple.factory.Ball;
import com.example.design.mode.demo.simple.factory.BasketBall;
import com.example.design.mode.demo.simple.factory.Soccer;
import lombok.Data;

/**
 * @author liuxiaojing
 * @description
 * @date 2021/6/30 下午7:53
 */
@Data
public class BallCut {
    private Ball ball;

    public void create(){
        System.out.println(ball.create());
    }

    public static void main(String[] args) {
        BallCut ballCut = new BallCut();
        ballCut.setBall(new Soccer());
        ballCut.create();

        ballCut.setBall(new BasketBall());
        ballCut.create();
    }
}
