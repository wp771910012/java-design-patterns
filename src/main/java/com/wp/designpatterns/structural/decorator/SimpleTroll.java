package com.wp.designpatterns.structural.decorator;

/**
 * @Description 普通的巨魔
 * @Author wangpeng
 * @Date 2019/3/25 14:18
 */
public class SimpleTroll implements Troll{
    @Override
    public void attack() {
        System.out.println("The troll tries to grab you!");
    }

    @Override
    public int getAttackPower() {
        return 10;
    }

    @Override
    public void fleeBattle() {
        System.out.println("The troll shrieks in horror and runs away!");
    }
}
