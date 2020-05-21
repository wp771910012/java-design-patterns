package com.wp.designpatterns.structural.proxy;

/**
 * @Description
 * @Author wangpeng
 * @Date 2019/4/2 13:30
 */
public class Wizard {

    private final String name;

    public Wizard(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

}
