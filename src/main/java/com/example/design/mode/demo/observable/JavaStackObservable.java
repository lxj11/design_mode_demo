package com.example.design.mode.demo.observable;

import lombok.Data;

import java.util.Observable;

/**
 * @author liuxiaojing
 * @description
 * @date 2021/7/2 下午2:19
 */
@Data
public class JavaStackObservable extends Observable {

    private String article;

    public void publish(String article){
        //发表文章
        this.article = article;
        //改变状体啊
        this.setChanged();
        //通知所有观察者
        this.notifyObservers();

    }

}
