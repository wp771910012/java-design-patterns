package com.wp.designpatterns.structural.bridge;

/**
 * @Description
 * @Author wangpeng
 * @Date 2019/3/26 10:13
 */
public class Main {
    public static void main(String[] args) {
        Sword sword = new Sword(new FlyingEnchantment());
        sword.wield();
        sword.swing();
        sword.unwield();
        Hammer hammer = new Hammer(new SoulEatingEnchantment());
        hammer.wield();
        hammer.swing();
        hammer.unwield();
    }
}
