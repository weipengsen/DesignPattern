package com.weips.designpattern.chainofresponsibility;

import android.util.Log;

public class ConcreteHandlerA extends Handler {
    @Override
    public void handleRequese(String request) {
        if (request.endsWith("A")) {
            Log.e("ConcreteHandlerA", "ConcreteHandlerA handled");
        } else {
            Log.e("ConcreteHandlerA", "ConcreteHandlerA not handled");
            successor.handleRequese(request);
        }
    }
}
