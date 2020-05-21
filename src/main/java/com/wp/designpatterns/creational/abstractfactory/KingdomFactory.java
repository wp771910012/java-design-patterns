package com.wp.designpatterns.creational.abstractfactory;

/**
 * @Description
 * @Author wangpeng
 * @Date 2019/3/20 13:45
 */
public interface KingdomFactory {
    Castle createCastle();
    King createKing();
    Army createArmy();
}
