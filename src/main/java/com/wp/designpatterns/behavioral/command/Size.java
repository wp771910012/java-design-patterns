package com.wp.designpatterns.behavioral.command;

/**
 * @Description 大小
 * @Author wangpeng
 * @Date 2019/4/22 11:23
 */
public enum  Size {

    SMALL("small"), NORMAL("normal");

    private String title;

    Size(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return title;
    }

}
