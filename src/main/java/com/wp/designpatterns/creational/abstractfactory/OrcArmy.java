package com.wp.designpatterns.creational.abstractfactory;

/**
 * @Description
 * @Author wangpeng
 * @Date 2019/3/20 13:43
 */
public class OrcArmy implements Army{

    static final String DESCRIPTION = "this is the orcish army";

    @Override
    public String getDescrition() {
        return DESCRIPTION;
    }
}
