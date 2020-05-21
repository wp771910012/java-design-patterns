package com.wp.designpatterns.creational.abstractfactory;

/**
 * @Description
 * @Author wangpeng
 * @Date 2019/3/20 14:05
 */
public class FactoryMaker {
    public enum KingdomType {
        //elven
        ELF
        //orcish
        , ORC
    }

    public static KingdomFactory makeFactory(KingdomType kingdomType) {
        switch (kingdomType) {
            case ELF:
                return new ElfKingdomFactory();
            case ORC:
                return new OrcKingdomFactory();
            default:
                return null;
        }
    }

    public static void main(String[] args) {
        System.out.println(makeFactory(KingdomType.ELF).createCastle().getDescritioon());
    }
}
