package com.wp.designpatterns.behavioral.chainofresponsibility;

/**
 * @Description
 * @Author wangpeng
 * @Date 2019/4/15 16:16
 */
public class Main {
    public static void main(String[] args) {
        OrcKing king = new OrcKing();
        king.makeRequest(new Request(RequestType.DEFEND_CASTLE, "defend castle"));
        king.makeRequest(new Request(RequestType.TORTURE_PRISONER, "torture prisoner"));
        king.makeRequest(new Request(RequestType.COLLECT_TAX, "collect tax"));
    }
}
