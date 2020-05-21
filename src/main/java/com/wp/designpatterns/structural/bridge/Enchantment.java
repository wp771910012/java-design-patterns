package com.wp.designpatterns.structural.bridge;

/**
 * @Description 附魔
 * @Author wangpeng
 * @Date 2019/3/26 9:16
 */
public interface Enchantment {
    void onActivate();
    void apply();
    void onDeactivate();
}
