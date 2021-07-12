package com.example.design.mode.demo.observable;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import java.util.Observable;
import java.util.Observer;

/**
 * @author liuxiaojing
 * @description
 * @date 2021/7/2 下午2:28
 */
@RequiredArgsConstructor
public class ReaderObserver implements Observer {

    @NonNull
    private String name;

    private String article;

    @Override
    public void update(Observable o, Object arg) {
        //更新文章
        updateArticle(o);
    }

    private void updateArticle(Observable o) {
        JavaStackObservable javaStackObservable = (JavaStackObservable) o;
        this.article = javaStackObservable.getArticle();
        System.out.println("我是读者："+ this.name +", 文章已更新为： " + this.article);
    }

}
