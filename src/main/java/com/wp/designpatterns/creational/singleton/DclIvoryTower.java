package com.wp.designpatterns.creational.singleton;

/**
 * @Description 双检锁/双重校验锁（DCL，即 double-checked locking）
 * @Author wangpeng
 * @Date 2019/3/20 16:38
 */
public class DclIvoryTower {

    private static volatile Object instance;

    public static Object getInstance(){
        if (instance == null){
            synchronized (DclIvoryTower.class){
                if (instance == null){
                    instance = new Object();
                }
            }
        }
        return instance;
    }
}
