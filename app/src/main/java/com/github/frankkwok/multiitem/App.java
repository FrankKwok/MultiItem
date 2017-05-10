package com.github.frankkwok.multiitem;

import android.app.Application;

/**
 * Created by Frank on 2017/5/10.
 */

public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        Utils.init(this);
    }
}
