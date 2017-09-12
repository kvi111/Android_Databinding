package com.test.databinding;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ListView;

import com.test.databinding.adapter.My2Adapter;
import com.test.databinding.model.TestInfo2;

import java.util.ArrayList;
import java.util.List;

public class Main2Activity extends Activity {

    private ListView listView = null;
    List<TestInfo2> listData = new ArrayList<TestInfo2>();
    Handler handler=new Handler();
    Runnable runnable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        listView = (ListView) findViewById(R.id.listview);

        getData();

        listView.setAdapter(new My2Adapter(this, listData));


        runnable = new Runnable() {
            @Override
            public void run() {
                // TODO Auto-generated method stub
                //要做的事情
                for(TestInfo2 testInfo : listData)
                {
                    testInfo.setImage(testInfo.getImage()+1);
                }
                handler.postDelayed(this, 2000);
            }
        };
        handler.postDelayed(runnable, 2000);//每两秒执行一次runnable.
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        handler.removeCallbacks(runnable);
    }

    public void getData() {
        for (int i = 0; i < 10; i++) {
            //TestInfo2 map = new TestInfo2("这是一个标题" + i, "这是一个详细信息" + i, R.drawable.ic_launcher);
            TestInfo2 testInfo2 = new TestInfo2("标题" + i, "详细信息" + i, i);
            listData.add(testInfo2);
        }
    }

    public void setData1(View view) {
        //TestInfo2 testInfo2 = (TestInfo2)listView.getAdapter().getItem(0);
        //testInfo2.setTitle("1111");
        //testInfo2.setImage(1111);

        listData.get(0).setImage(1111);
    }
}
