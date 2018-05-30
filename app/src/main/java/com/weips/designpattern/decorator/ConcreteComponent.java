package com.weips.designpattern.decorator;

import android.util.Log;

/**
 * 被装饰的具体对象
 */
public class ConcreteComponent extends Component {
    @Override
    public void operate() {
        Log.d("ConcreteComponent","ConcreteComponent operate");
    }
}
