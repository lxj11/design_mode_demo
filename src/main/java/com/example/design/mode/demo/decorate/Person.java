package com.example.design.mode.demo.decorate;

import lombok.Data;

/**
 * @author liuxiaojing
 * @description
 * @date 2021/7/13 下午7:31
 */
@Data
public class Person implements Component {

    private String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public void show() {
        System.out.println("装扮的" + name);

    }
}
