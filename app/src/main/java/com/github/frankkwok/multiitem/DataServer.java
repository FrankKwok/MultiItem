package com.github.frankkwok.multiitem;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Frank on 2017/5/10.
 */

public class DataServer {
    private static final String CYM_CHAD = "CymChad";

    public static List<MultipleItem> getMultipleItemData() {
        List<MultipleItem> list = new ArrayList<>();
        for (int i = 0; i <= 4; i++) {
            list.add(new MultipleItem(MultipleItem.IMG, MultipleItem.IMG_SPAN_SIZE));
            list.add(new MultipleItem(MultipleItem.TEXT, MultipleItem.TEXT_SPAN_SIZE, CYM_CHAD));
            list.add(new MultipleItem(MultipleItem.IMG_TEXT, MultipleItem.IMG_TEXT_SPAN_SIZE));
            list.add(new MultipleItem(MultipleItem.IMG_TEXT, MultipleItem.IMG_TEXT_SPAN_SIZE_MIN));
            list.add(new MultipleItem(MultipleItem.IMG_TEXT, MultipleItem.IMG_TEXT_SPAN_SIZE_MIN));
        }
        return list;
    }
}
