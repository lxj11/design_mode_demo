package com.example.design.mode.demo.abstr.factory;

import com.example.design.mode.demo.simple.factory.Ball;

/**
 * @author liuxiaojing
 * @description
 * @date 2021/7/14 下午4:03
 */
public interface AbstrBallFactory {

    Ball createBall();

    Journal createJournal();

}
