package com.example.design.mode.demo.listener;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.context.ApplicationListener;
import org.springframework.scheduling.annotation.Async;

/**
 * @author liuxiaojing
 * @description
 * @date 2021/7/5 下午4:38
 */
@RequiredArgsConstructor
public class ReaderListener implements ApplicationListener<JavaStackEvent> {

    @NonNull
    private String name;

    private String article;


    @Override
    @Async
    public void onApplicationEvent(JavaStackEvent event) {
        //更新文章
        updateArticle(event);

    }

    private void updateArticle(JavaStackEvent event) {
        this.article = (String) event.getSource();
        System.out.println("我是读者：" + this.name + ",文章已更新为" + this.article);
    }
}
