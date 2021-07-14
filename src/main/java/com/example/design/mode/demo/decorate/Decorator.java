package com.example.design.mode.demo.decorate;

/**
 * @author liuxiaojing
 * @description
 * @date 2021/7/13 下午7:32
 */
public class Decorator implements Component {

    private  Component component;

    public void decoratorObj(Component component){
        this.component = component;
    }

    @Override
    public void show() {
        if(component != null){
            component.show();
        }

    }
}
