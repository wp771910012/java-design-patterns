package com.wp.designpatterns.behavioral.chainofresponsibility;

/**
 * @Description
 * @Author wangpeng
 * @Date 2019/4/15 16:12
 */
public class OrcKing {

    RequestHandler chain;

    public OrcKing() {
        buildChain();
    }

    private void buildChain() {
        chain = new OrcCommander(new OrcOfficer(new OrcSoldier(null)));
    }

    public void makeRequest(Request req) {
        chain.handleRequest(req);
    }
}
