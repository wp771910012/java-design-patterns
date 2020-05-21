package com.wp.designpatterns.behavioral.template;

/**
 * @Description
 * @Author wangpeng
 * @Date 2019/4/22 10:04
 */
public class HitAndRunMethod extends StealingMethod {
    @Override
    protected String pickTarget() {
        return "old goblin woman";
    }

    @Override
    protected void confuseTarget(String target) {
        System.out.println("Approach the "+ target +" from behind.");
    }

    @Override
    protected void stealTheItem(String target) {
        System.out.println("Grab the handbag and run away fast!");
    }
}
