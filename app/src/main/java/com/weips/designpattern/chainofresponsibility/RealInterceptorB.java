package com.weips.designpattern.chainofresponsibility;

public class RealInterceptorB implements Interceptor{
    @Override
    public String intercept(Chain chain) {
        String request = chain.getRequest();

        String response;

        if (!request.endsWith("B")) {
            String newRequest = request;
            response = chain.procceed(newRequest);
        } else {
            response = request + "  RealInterceptorB";
        }
        return response;
    }
}
