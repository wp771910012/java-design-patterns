package com.wp.designpatterns.structural.flyweight;

/**
 * @Description 隐身药剂
 * @Author wangpeng
 * @Date 2019/4/12 9:10
 */
public class InvisibilityPotion implements Potion {
    @Override
    public void drink() {
        System.out.println("You become invisible. (Potion="+System.identityHashCode(this)+")");
    }
}
