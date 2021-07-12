package com.example.design.mode.demo.builder;

import lombok.Data;

/**
 * @author liuxiaojing
 * @description
 * @date 2021/6/30 下午7:06
 */
@Data
public class Computer {

    //接口
    private CPU cpu;
    //接口
    private MainBoard mainBoard;
    //接口
    private DisPlayer disPlayer;
}
