package com.wp.designpatterns.creational.abstractfactory;

/**
 * @Description
 * @Author wangpeng
 * @Date 2019/3/20 13:37
 */
public class ElfArmy implements Army{

    static final String DESCRIPTION = "this is the elven army";

    @Override
    public String getDescrition() {
        return DESCRIPTION;
    }
}
