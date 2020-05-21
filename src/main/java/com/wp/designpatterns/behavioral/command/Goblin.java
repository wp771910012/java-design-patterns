package com.wp.designpatterns.behavioral.command;

/**
 * @Description 哥布林
 * @Author wangpeng
 * @Date 2019/4/22 11:31
 */
public class Goblin extends Target {

    public Goblin() {
        setSize(Size.NORMAL);
        setVisibility(Visibility.VISIBLE);
    }

    @Override
    public String toString() {
        return "Goblin";
    }
}
