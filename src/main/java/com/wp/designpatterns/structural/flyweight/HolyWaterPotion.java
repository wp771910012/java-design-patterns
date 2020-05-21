package com.wp.designpatterns.structural.flyweight;

/**
 * @Description 圣水药剂
 * @Author wangpeng
 * @Date 2019/4/12 9:07
 */
public class HolyWaterPotion implements Potion{
    @Override
    public void drink() {
        System.out.println("You feel blessed. (Potion="+System.identityHashCode(this)+")");
    }
}
