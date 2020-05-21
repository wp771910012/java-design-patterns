package com.wp.designpatterns.structural.facade;

/**
 * @Description
 * @Author wangpeng
 * @Date 2019/4/1 9:42
 */
public class DwarvenTunnelDigger extends DwarvenMineWorker {
    @Override
    public void work() {
        System.out.println(name() + " creates another promising tunnel.");
    }

    @Override
    public String name() {
        return "Dwarven tunnel digger";
    }
}
