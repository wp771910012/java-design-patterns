package com.wp.designpatterns.structural.bridge;

/**
 * @Description 飞行附魔
 * @Author wangpeng
 * @Date 2019/3/26 9:39
 */
public class FlyingEnchantment implements Enchantment{
    @Override
    public void onActivate() {
        System.out.println("The item begins to glow faintly.");
    }

    @Override
    public void apply() {
        System.out.println("The item flies and strikes the enemies finally returning to owner's hand.");
    }

    @Override
    public void onDeactivate() {
        System.out.println("The item's glow fades.");
    }
}
