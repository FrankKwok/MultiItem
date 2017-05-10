package com.github.frankkwok.multiitem;

import android.view.View;

import com.chad.library.adapter.base.BaseViewHolder;

/**
 * Created by Frank on 2017/5/10.
 */

public class SomethingHolder extends BaseViewHolder implements Something {
    public SomethingHolder(View view) {
        super(view);
    }

    @Override
    public void doSomething() {
        ToastUtils.showShort("doSomething");
    }
}
