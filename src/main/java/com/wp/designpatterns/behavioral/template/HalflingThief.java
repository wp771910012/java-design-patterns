package com.wp.designpatterns.behavioral.template;

/**
 * @Description
 * @Author wangpeng
 * @Date 2019/4/22 10:05
 */
public class HalflingThief {

    private StealingMethod method;

    public HalflingThief(StealingMethod method) {
        this.method = method;
    }

    public void steal() {
        method.steal();
    }

    public void changeMethod(StealingMethod method) {
        this.method = method;
    }
}
