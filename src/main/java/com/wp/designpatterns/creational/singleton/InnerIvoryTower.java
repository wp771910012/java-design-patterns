package com.wp.designpatterns.creational.singleton;

/**
 * @Description 静态内部类实现
 * @Author wangpeng
 * @Date 2019/3/20 16:42
 */
public class InnerIvoryTower {
    private static class InnerIvoryToweHolder{
        private static final InnerIvoryTower instance = new InnerIvoryTower();
    }

    public static final InnerIvoryTower getInstance(){
        return InnerIvoryToweHolder.instance;
    }
}
