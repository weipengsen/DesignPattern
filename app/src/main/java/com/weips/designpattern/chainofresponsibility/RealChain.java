package com.weips.designpattern.chainofresponsibility;

import java.util.List;

public class RealChain implements Interceptor.Chain {
    public String request;
    public List<Interceptor> intercepterList;
    public int index;

    public RealChain(String request, List<Interceptor> list, int index) {
        this.request = request;
        this.intercepterList = list;
        this.index = index;
    }

    @Override
    public String getRequest() {
        return request;
    }

    @Override
    public String procceed(String newrequest) {
        String response = "";
        if (intercepterList.size() > index) {
            RealChain nextChain = new RealChain(newrequest, intercepterList, index++);

            Interceptor interceptor = intercepterList.get(index);
            response = interceptor.intercept(nextChain);
        }

        return response;
    }
}
