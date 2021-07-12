package com.example.design.mode.demo.builder;

/**
 * @author liuxiaojing
 * @description
 * @date 2021/6/30 下午7:12
 */
public class XiaoMiBuilder extends Builder {

    private Computer computer = new Computer();
    @Override
    void buildCPU() {
        computer.setCpu(new InterCPU());

    }

    @Override
    void buildMainBoard() {
        computer.setMainBoard(new AMainBoard());
    }

    @Override
    void buildDisPlayer() {
        computer.setDisPlayer(new ADisPlayer());
    }

    @Override
    Computer builderComputer() {
        return computer;
    }
}
