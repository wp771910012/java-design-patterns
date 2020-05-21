package com.wp.designpatterns.behavioral.observer;

/**
 * @Description
 * @Author wangpeng
 * @Date 2019/4/16 9:27
 */
public class Main {
    public static void main(String[] args) {
        Weather weather = new Weather();
        weather.addObserver(new Orcs());
        weather.addObserver(new Hobbits());
        weather.timePasses();
        weather.timePasses();
        weather.timePasses();
        weather.timePasses();
        weather.timePasses();
    }
}
