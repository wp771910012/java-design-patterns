package com.wp.designpatterns.creational.abstractfactory;

/**
 * @Description
 * @Author wangpeng
 * @Date 2019/3/20 13:58
 */
public class OrcKingdomFactory implements KingdomFactory{
    @Override
    public Castle createCastle() {
        return new OrcCastle();
    }

    @Override
    public King createKing() {
        return new OrcKing();
    }

    @Override
    public Army createArmy() {
        return new OrcArmy();
    }
}
