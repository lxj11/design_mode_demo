package com.example.design.mode.demo.singleton;


import javax.websocket.Session;

/**
 * @author liuxiaojing
 * @description
 * @date 2021/6/30 下午7:01
 */
public class ShiroUtils {
    public static Session session;
    public static Session getSession(){
        if(session == null){
            synchronized (ShiroUtils.class){
                if(session == null){
//                    session = SecurityUtils.getSubject().getSession();
                }
            }

        }
        return session;
    }
}
