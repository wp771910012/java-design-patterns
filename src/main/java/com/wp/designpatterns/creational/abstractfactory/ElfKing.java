package com.wp.designpatterns.creational.abstractfactory;

/**
 * @Description
 * @Author wangpeng
 * @Date 2019/3/20 13:33
 */
public class ElfKing implements King{

    static final String DESCRIPTION = "this is the elven king";

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
