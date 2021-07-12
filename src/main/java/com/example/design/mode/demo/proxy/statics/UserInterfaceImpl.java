package com.example.design.mode.demo.proxy.statics;

/**
 * @author liuxiaojing
 * @description
 * @date 2021/7/7 上午10:26
 */
public class UserInterfaceImpl implements UserInterface {
    @Override
    public boolean saveUser(User user) {
        System.out.println("保存用户：" + user.getUsername());
        return true;
    }


}
