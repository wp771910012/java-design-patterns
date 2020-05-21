package com.wp.designpatterns.structural.bridge;

/**
 * @Description 武器
 * @Author wangpeng
 * @Date 2019/3/26 9:15
 */
public interface Weapon {
    void wield();
    void swing();
    void unwield();
    Enchantment getEnchantment();
}
