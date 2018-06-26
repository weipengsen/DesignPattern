package com.weips.designpattern.chainofresponsibility;

/**
 * 定义：使多个对象都有机会处理请求，从而避免了请求的发送者和接收者之间的耦合关系。将这些对象连成一条链，
 *      并沿着这条链传递该请求，直到有对象处理它为止。
 * 使用场景：多个对象处理同一个请求 ，但具体由哪个对象处理则在运行时动态决定；
 *          在请求处理者不明确的情况下向多个对象中的一个提交请求；
 *          需要动态指定一组对象处理请求。
 */
public abstract class Handler {
    public Handler successor;

    public abstract void handleRequese(String request);
}
