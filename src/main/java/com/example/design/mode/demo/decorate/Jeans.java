package com.example.design.mode.demo.decorate;

/**
 * @author liuxiaojing
 * @description
 * @date 2021/7/13 下午7:34
 */
public class Jeans extends Decorator {

    @Override
    public void show() {
        System.out.println("穿牛仔裤");
        super.show();
    }

}
