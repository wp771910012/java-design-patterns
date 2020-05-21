package com.wp.designpatterns.structural.decorator;

/**
 * @Description
 * @Author wangpeng
 * @Date 2019/3/25 14:22
 */
public class Main {
    public static void main(String[] args) {
        SimpleTroll simpleTroll = new SimpleTroll();
        simpleTroll.attack();
        simpleTroll.fleeBattle();
        ClubbedTroll clubbedTroll = new ClubbedTroll(simpleTroll);
        clubbedTroll.attack();
        clubbedTroll.fleeBattle();
    }
}
