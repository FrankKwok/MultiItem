package com.github.frankkwok.multiitem;

import android.content.Context;

/**
 * Utils初始化相关
 */

public class Utils {
    @SuppressWarnings("StaticFieldLeak")
    private static Context context;

    private Utils() {
        throw new UnsupportedOperationException();
    }

    /**
     * 初始化全局Context
     *
     * @param context 初始化的Context
     */
    public static void init(Context context) {
        Utils.context = context.getApplicationContext();
    }

    public static Context getContext() {
        if (context == null) {
            throw new NullPointerException("You should init context first!");
        }
        return context;
    }
}
