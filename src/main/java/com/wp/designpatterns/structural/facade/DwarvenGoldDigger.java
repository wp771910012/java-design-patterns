package com.wp.designpatterns.structural.facade;

/**
 * @Description
 * @Author wangpeng
 * @Date 2019/4/1 9:43
 */
public class DwarvenGoldDigger extends DwarvenMineWorker {

    @Override
    public void work() {
        System.out.println(name() + " digs for gold.");
    }

    @Override
    public String name() {
        return "Dwarf gold digger";
    }
}
