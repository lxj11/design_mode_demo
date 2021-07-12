package com.example.design.mode.demo.builder;

/**
 * @author liuxiaojing
 * @description
 * @date 2021/6/30 下午7:10
 */
public abstract class Builder {

    abstract void buildCPU();

    abstract void buildMainBoard();

    abstract void buildDisPlayer();

    abstract Computer builderComputer();
}
