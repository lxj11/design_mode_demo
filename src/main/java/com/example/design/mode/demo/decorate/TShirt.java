package com.example.design.mode.demo.decorate;

/**
 * @author liuxiaojing
 * @description
 * @date 2021/7/13 下午7:38
 */
public class TShirt extends Decorator {
    @Override
    public void show() {
        System.out.println("穿T-shirt");
        super.show();
    }
}
