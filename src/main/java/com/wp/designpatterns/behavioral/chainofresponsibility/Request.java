package com.wp.designpatterns.behavioral.chainofresponsibility;

import java.util.Objects;

/**
 * @Description 请求
 * @Author wangpeng
 * @Date 2019/4/15 14:37
 */
public class Request {
    private final RequestType requestType;
    private final String requestDescription;
    private boolean handled;

    public Request(final RequestType requestType, final String requestDescription) {
        this.requestType = Objects.requireNonNull(requestType);
        this.requestDescription = Objects.requireNonNull(requestDescription);
    }

    public String getRequestDescription() { return requestDescription; }

    public RequestType getRequestType() { return requestType; }

    public void markHandled() { this.handled = true; }

    public boolean isHandled() { return this.handled; }

    @Override
    public String toString() { return getRequestDescription(); }
}
