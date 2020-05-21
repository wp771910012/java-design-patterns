package com.wp.designpatterns.structural.flyweight;

/**
 * @Description
 * @Author wangpeng
 * @Date 2019/4/12 9:16
 */
public class Main {
    public static void main(String[] args) {
        PotionFactory factory = new PotionFactory();
        factory.createPotion(PotionType.INVISIBILITY).drink();
        factory.createPotion(PotionType.HEALING).drink();
        factory.createPotion(PotionType.INVISIBILITY).drink();
        factory.createPotion(PotionType.HOLY_WATER).drink();
        factory.createPotion(PotionType.HOLY_WATER).drink();
        factory.createPotion(PotionType.HEALING).drink();
    }
}
