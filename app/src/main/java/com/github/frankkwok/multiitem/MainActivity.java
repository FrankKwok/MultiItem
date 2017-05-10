package com.github.frankkwok.multiitem;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        List<MultipleItem> dataList = DataServer.getMultipleItemData();
        MultipleItemQuickAdapter multipleItemAdapter = new MultipleItemQuickAdapter(this, dataList);
        recyclerView.setAdapter(multipleItemAdapter);
    }
}
