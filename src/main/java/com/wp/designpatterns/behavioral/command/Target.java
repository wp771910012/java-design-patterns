package com.wp.designpatterns.behavioral.command;

/**
 * @Description 目标
 * @Author wangpeng
 * @Date 2019/4/22 11:22
 */
public abstract class Target {

    private Size size;

    private Visibility visibility;

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public Visibility getVisibility() {
        return visibility;
    }

    public void setVisibility(Visibility visibility) {
        this.visibility = visibility;
    }

    @Override
    public abstract String toString();

    /**
     * Print status
     */
    public void printStatus() {
        System.out.println(this + ", [size=" + getSize() + "] [visibility=" + getVisibility() + "]");
    }

}
