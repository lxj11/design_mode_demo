package com.example.design.mode.demo.abstr.factory;

import com.example.design.mode.demo.simple.factory.Ball;
import com.example.design.mode.demo.simple.factory.Soccer;

/**
 * @author liuxiaojing
 * @description
 * @date 2021/6/30 下午3:57
 */
public class SoccerFactory1 implements AbstrBallFactory {


    @Override
    public Ball createBall() {
        return new Soccer();
    }

    @Override
    public Journal createJournal() {
        return new SoccerJournal();
    }
}
