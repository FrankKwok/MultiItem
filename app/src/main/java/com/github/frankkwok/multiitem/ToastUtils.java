package com.github.frankkwok.multiitem;

import android.support.annotation.StringRes;
import android.widget.Toast;

/**
 * 吐司工具类
 */

public class ToastUtils {
    public static void showShort(String text) {
        Toast.makeText(Utils.getContext(), text, Toast.LENGTH_SHORT).show();
    }

    public static void showShort(@StringRes int resId) {
        showShort(Utils.getContext().getString(resId));
    }
}
