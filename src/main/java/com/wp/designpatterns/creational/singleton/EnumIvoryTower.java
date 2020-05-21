package com.wp.designpatterns.creational.singleton;

/**
 * @Description
 * @Author wangpeng
 * @Date 2019/3/20 15:44
 */
public enum EnumIvoryTower {
    INSTANCE;

    public static EnumIvoryTower getInstance(){
        return INSTANCE;
    }
}
