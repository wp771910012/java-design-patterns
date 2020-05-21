package com.wp.designpatterns.behavioral.chainofresponsibility;

/**
 * @Description
 * @Author wangpeng
 * @Date 2019/4/15 16:08
 */
public abstract class RequestHandler {

    private RequestHandler next;

    public RequestHandler(RequestHandler next) {
        this.next = next;
    }

    public void handleRequest(Request req) {
        if (next != null) {
            next.handleRequest(req);
        }
    }

    protected void printHandling(Request req) {
        System.out.println(this + " handling request " + req);
    }

    @Override
    public abstract String toString();
}
