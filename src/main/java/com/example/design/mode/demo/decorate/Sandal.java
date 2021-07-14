package com.example.design.mode.demo.decorate;

/**
 * @author liuxiaojing
 * @description
 * @date 2021/7/13 下午7:40
 */
public class Sandal extends Decorator {
    @Override
    public void show() {
        System.out.println("穿凉鞋");
        super.show();
    }
}
