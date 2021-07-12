package com.example.design.mode.demo.prototype;

import lombok.Builder;
import lombok.Data;

/**
 * @author liuxiaojing
 * @description
 * @date 2021/6/30 下午7:31
 */
@Data
@Builder
public class User implements Cloneable {
    private String name;
    private int age;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new User(this.name, this.age);
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        User u1 = new User("a", 1);
        User u2 = (User) u1.clone();
        u1.setAge(18);
        System.out.println(u2.getAge());
    }

}
