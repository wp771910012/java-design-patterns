package com.wp.designpatterns.structural.facade;

/**
 * @Description
 * @Author wangpeng
 * @Date 2019/4/1 9:48
 */
public class DwarvenCartOperator extends DwarvenMineWorker {
    @Override
    public void work() {
        System.out.println(name() + " moves gold chunks out of the mine.");
    }

    @Override
    public String name() {
        return "Dwarf cart operator";
    }
}
