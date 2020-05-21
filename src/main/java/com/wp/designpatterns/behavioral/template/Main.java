package com.wp.designpatterns.behavioral.template;

/**
 * @Description
 * @Author wangpeng
 * @Date 2019/4/22 10:07
 */
public class Main {
    public static void main(String[] args) {
        HalflingThief thief = new HalflingThief(new HitAndRunMethod());
        thief.steal();
        thief.changeMethod(new SubtleMethod());
        thief.steal();
    }
}
