package com.weips.designpattern.chainofresponsibility;

import android.util.Log;

public class ConcreteHandlerB extends Handler {
    @Override
    public void handleRequese(String request) {
        if (request.endsWith("B")) {
            Log.e("ConcreteHandlerB", "ConcreteHandlerB handled");
        } else {
            successor.handleRequese(request);
        }
    }
}
