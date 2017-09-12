package com.test.databinding;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.ListView;

import com.test.databinding.adapter.MyAdapter;
import com.test.databinding.model.TestInfo;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity {

    private ListView listView = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.listview);
        List<TestInfo> list = getData();
        listView.setAdapter(new MyAdapter(this, list));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    public List<TestInfo> getData() {
        List<TestInfo> list = new ArrayList<TestInfo>();
        for (int i = 0; i < 10; i++) {
            TestInfo testInfo = new TestInfo("这是一个标题" + i, "这是一个详细信息" + i, R.drawable.ic_launcher);
            list.add(testInfo);
        }
        return list;
    }

    public void openActivity2(View view) {
        startActivity(new Intent(this, Main2Activity.class));
    }

    public void openActivity3(View view) {
        startActivity(new Intent(this, Main3Activity.class));
    }

    public void openActivity4(View view) {
        startActivity(new Intent(this, Main4Activity.class));
    }
}