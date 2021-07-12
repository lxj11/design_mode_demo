package com.example.design.mode.demo.proxy.statics;

/**
 * @author liuxiaojing
 * @description
 * @date 2021/7/7 上午10:28
 */
public class StaticProxy implements UserInterface {

    private UserInterface userInterface;

    public StaticProxy(UserInterface userInterface) {
        this.userInterface = userInterface;
    }

    @Override
    public boolean saveUser(User user) {
        System.out.println("静态代理-开始保存用户");
        boolean b = this.userInterface.saveUser(user);
        System.out.println("静态代理-保存用户结果：" + b);
        System.out.println();
        return true;
    }

}
