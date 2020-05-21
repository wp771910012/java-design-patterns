package com.wp.designpatterns.structural.facade;

/**
 * @Description
 * @Author wangpeng
 * @Date 2019/4/1 9:50
 */
public class Main {
    public static void main(String[] args) {
        DwarvenGoldmineFacade facade = new DwarvenGoldmineFacade();
        facade.startNewDay();
        System.out.println("-----------");
        facade.digOutGold();
        System.out.println("-----------");
        facade.endDay();
    }
}
