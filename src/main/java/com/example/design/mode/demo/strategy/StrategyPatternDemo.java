package com.example.design.mode.demo.strategy;

/**
 * @author liuxiaojing
 * @description 策略模式
 * @date 2021/7/1 下午5:08
 */
public class StrategyPatternDemo {
    public static void main(String[] args) {
        Context context = new Context(new OperationAdd());
        System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

        context = new Context(new OperationSubstract());
        System.out.println("20 - 18 = " + context.executeStrategy(20, 18));
    }
}
