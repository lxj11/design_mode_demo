package com.example.design.mode.demo.strategy;

/**
 * @author liuxiaojing
 * @description
 * @date 2021/7/1 下午5:07
 */
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public int executeStrategy(int num1, int num2){
        return strategy.doOperation(num1, num2);

    }
}
