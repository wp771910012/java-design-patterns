package com.wp.designpatterns.structural.bridge;

/**
 * @Description Enchantment
 * @Author wangpeng
 * @Date 2019/3/26 10:12
 */
public class SoulEatingEnchantment implements Enchantment {
    @Override
    public void onActivate() {
        System.out.println("The item spreads bloodlust.");
    }

    @Override
    public void apply() {
        System.out.println("The item eats the soul of enemies.");
    }

    @Override
    public void onDeactivate() {
        System.out.println("Bloodlust slowly disappears.");
    }
}
