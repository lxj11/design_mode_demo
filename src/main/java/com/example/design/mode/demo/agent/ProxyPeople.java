package com.example.design.mode.demo.agent;

import lombok.Data;

/**
 * @author liuxiaojing
 * @description
 * @date 2021/6/30 下午7:41
 */
@Data
public class ProxyPeople implements Buy {

    private People people;

    @Override
    public void buyCar() {
        System.out.println("4s店帮你纳税， 上保险。。。");
        people.buyCar();
    }

    public ProxyPeople(People people) {
        this.people = people;
    }

    public static void main(String[] args) {
        Buy buy = new ProxyPeople(new People());
        buy.buyCar();
    }
}
