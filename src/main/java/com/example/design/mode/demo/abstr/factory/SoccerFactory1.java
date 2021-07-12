package com.example.design.mode.demo.abstr.factory;

import com.example.design.mode.demo.factory.BallFactory;
import com.example.design.mode.demo.simple.factory.Ball;
import com.example.design.mode.demo.simple.factory.Soccer;

/**
 * @author liuxiaojing
 * @description
 * @date 2021/6/30 下午3:57
 */
public class SoccerFactory1 implements BallFactory {

    @Override
    public Ball create() {
        return new Soccer();
    }
    public Journal createJournal(){
        return new SoccerJournal();
    }
}
