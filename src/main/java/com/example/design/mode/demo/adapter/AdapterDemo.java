package com.example.design.mode.demo.adapter;

/**
 * @author liuxiaojing
 * @description
 */
public class AdapterDemo {
    public static void main(String[] args) {
        Typec2Vga1 typec2Vga1 = new Typec2Vga1();
        typec2Vga1.vgaInterface();
        System.out.println("显示屏对接适配器，手机成功投影到显示屏");
        System.out.println();


        Typec2Vga2 typec2Vga2 = new Typec2Vga2(new Phone());
        typec2Vga2.vgaInterface();
        System.out.println("显示屏对接适配器，手机成功投影到显示屏");
    }
}
