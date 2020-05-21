package com.wp.designpatterns.creational.abstractfactory;

/**
 * @Description
 * @Author wangpeng
 * @Date 2019/3/20 13:41
 */
public class OrcCastle implements Castle{

    static final String DESCRIPTION = "this is the orcish castle";

    @Override
    public String getDescritioon() {
        return DESCRIPTION;
    }
}
