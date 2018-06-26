package com.weips.designpattern.chainofresponsibility;

public class RealInterceptorA implements Interceptor {
    @Override
    public String intercept(Chain chain) {
        String request = chain.getRequest();

        String response;

        if (!request.endsWith("A")) {
            String newRequest = request;
            response = chain.procceed(newRequest);
        } else {
            response = request + "  RealInterceptorA";
        }
        return response;
    }
}
