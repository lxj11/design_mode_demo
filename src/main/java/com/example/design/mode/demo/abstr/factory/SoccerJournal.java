package com.example.design.mode.demo.abstr.factory;

/**
 * @author liuxiaojing
 * @description
 * @date 2021/6/30 下午3:22
 */
public class SoccerJournal implements Journal {

    @Override
    public String create() {
        return "give you a Soccer Journal...";
    }
}
