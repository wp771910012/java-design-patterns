package com.wp.designpatterns.behavioral.template;

/**
 * @Description
 * @Author wangpeng
 * @Date 2019/4/16 9:51
 */
public abstract class StealingMethod {

    protected abstract String pickTarget();

    protected abstract void confuseTarget(String target);

    protected abstract void stealTheItem(String target);

    public void steal() {
        String target = pickTarget();
        System.out.println("The target has been chosen as " + target);
        confuseTarget(target);
        stealTheItem(target);
    }
}
