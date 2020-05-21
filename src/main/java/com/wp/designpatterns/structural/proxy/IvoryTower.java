package com.wp.designpatterns.structural.proxy;

/**
 * @Description
 * @Author wangpeng
 * @Date 2019/4/2 13:30
 */
public class IvoryTower implements WizardTower{

    @Override
    public void enter(Wizard wizard) {
        System.out.println(wizard + " enters the tower.");
    }
}
