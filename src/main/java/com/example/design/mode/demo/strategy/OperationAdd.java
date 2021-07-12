package com.example.design.mode.demo.strategy;

/**
 * @author liuxiaojing
 * @description
 * @date 2021/7/1 下午5:05
 */
public class OperationAdd implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 + num2;
    }
}
