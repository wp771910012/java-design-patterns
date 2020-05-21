package com.wp.designpatterns.creational.abstractfactory;

/**
 * @Description
 * @Author wangpeng
 * @Date 2019/3/20 13:42
 */
public class OrcKing implements King{

    static String DESCRIPTION = "this is the orcish king";

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
