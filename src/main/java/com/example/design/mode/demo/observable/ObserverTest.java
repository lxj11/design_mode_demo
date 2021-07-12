package com.example.design.mode.demo.observable;

/**
 * @author liuxiaojing
 * @description
 * @date 2021/7/2 下午2:36
 */
public class ObserverTest {
    public static void main(String[] args) {
        //创建一个观察者目标
        JavaStackObservable javaStackObservable = new JavaStackObservable();
        //添加观察者
        javaStackObservable.addObserver(new ReaderObserver("小明"));
        javaStackObservable.addObserver(new ReaderObserver("小蓝"));
        javaStackObservable.addObserver(new ReaderObserver("小红"));
        //发表文章
        javaStackObservable.publish("观察者模式练习文章");
    }
}
