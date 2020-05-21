package com.wp.designpatterns.behavioral.command;

/**
 * @Description 命令
 * @Author wangpeng
 * @Date 2019/4/22 11:21
 */
public abstract class Command {

    public abstract void execute(Target target);

    public abstract void undo();

    public abstract void redo();

    @Override
    public abstract String toString();
}
