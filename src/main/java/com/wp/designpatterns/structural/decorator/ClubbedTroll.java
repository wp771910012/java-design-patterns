package com.wp.designpatterns.structural.decorator;

/**
 * @Description 带有棍棒的巨魔
 * @Author wangpeng
 * @Date 2019/3/25 14:20
 */
public class ClubbedTroll implements Troll{

    private Troll decorated;

    public ClubbedTroll(Troll decorated) {
        this.decorated = decorated;
    }

    @Override
    public void attack() {
        decorated.attack();
        System.out.println("The troll swings at you with a club!");
    }

    @Override
    public int getAttackPower() {
        return decorated.getAttackPower() + 10;
    }

    @Override
    public void fleeBattle() {
        decorated.fleeBattle();
    }
}
