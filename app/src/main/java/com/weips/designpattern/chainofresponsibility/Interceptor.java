package com.weips.designpattern.chainofresponsibility;


/**
 * request 和 response 都用 String 替代
 */
public interface Interceptor {
    /**
     *
     * @param chain 通过 chain 链的一环获取到请求 request
     * @return 返回结果 response
     */
    String intercept(Chain chain);

    interface Chain{
        String getRequest();
        String procceed(String request);
    }
}
