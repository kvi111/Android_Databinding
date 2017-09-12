package com.test.databinding;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.test.databinding.databinding.ActivityMain3Binding;
import com.test.databinding.model.TestInfo2;
import com.test.databinding.model.TestInfo3;

public class Main3Activity extends AppCompatActivity {

    private TestInfo2 testInfo2 = new TestInfo2("fei", null, 27);
    private TestInfo3 testInfo3 = new TestInfo3();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main3);

        //ActivityMain3Binding 将我们布局文件的首字母大写，并且去掉下划线，将下划线后面的字母大写，加上Binding组成
        ActivityMain3Binding binding = DataBindingUtil.setContentView(this, R.layout.activity_main3);

        binding.setTestInfo2(testInfo2);
        binding.setTestInfo3(testInfo3);
        testInfo3.title.set("titleTest");
    }

    public void setInfo(View view) {
        testInfo2.setInfo("~~~~~~~~");
        testInfo2.setTitle("~~~~~~~~");
    }
    public void setTitle(View view) {
        testInfo3.title.set("!!!!!!!!");
    }
}
