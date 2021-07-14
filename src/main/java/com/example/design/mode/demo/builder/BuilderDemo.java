package com.example.design.mode.demo.builder;


import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/**
 * @author liuxiaojing
 * @description
 * @date 2021/7/14 下午5:57
 */
public class BuilderDemo {
    public static void main(String[] args) {
        Decorator decorator = new Decorator(new XiaoMiBuilder());
        decorator.show();
        System.out.println(decorator);
    }
}
