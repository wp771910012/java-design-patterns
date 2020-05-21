package com.wp.designpatterns.creational.abstractfactory;

/**
 * @Description
 * @Author wangpeng
 * @Date 2019/3/20 13:31
 */
public class ElfCastle implements Castle {

    static final String DESCRITION = "this is the elven castle";

    @Override
    public String getDescritioon() {
        return DESCRITION;
    }
}
