package com.example.design.mode.demo.decorate;

/**
 * @author liuxiaojing
 * @description
 * @date 2021/7/13 下午7:37
 */
public class Pelisse extends Decorator {

    @Override
    public void show() {
        System.out.println("穿皮衣");
        super.show();
    }
}
