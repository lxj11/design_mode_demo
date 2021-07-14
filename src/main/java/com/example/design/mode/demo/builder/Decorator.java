package com.example.design.mode.demo.builder;

import lombok.Data;

/**
 * @author liuxiaojing
 * @description
 * @date 2021/7/14 下午6:14
 */
@Data
public class Decorator {
    private Builder builder;

    public Decorator(Builder builder) {
        this.builder = builder;
    }

    public Computer show(){
        builder.buildCPU();
        builder.buildDisPlayer();
        builder.buildMainBoard();
        return builder.builderComputer();
    }
}
