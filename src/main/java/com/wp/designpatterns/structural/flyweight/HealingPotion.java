package com.wp.designpatterns.structural.flyweight;

/**
 * @Description 治疗药剂
 * @Author wangpeng
 * @Date 2019/4/12 9:05
 */
public class HealingPotion implements Potion{
    @Override
    public void drink() {
        System.out.println("You feel healed. (Potion="+System.identityHashCode(this)+")");
    }
}
