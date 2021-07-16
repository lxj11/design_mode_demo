package com.example.design.mode.demo.adapter;

/**
 * @author liuxiaojing
 * @description 类的适配器
 */
public class Typec2Vga1 extends Phone implements Vga {
    @Override
    public void vgaInterface() {
        typecPhone();
        System.out.println("接收到Type-c口信息，信息转换成VGA接口中...");
        System.out.println("信息已转换成VGA接口，显示屏可以对接。");
    }
}
