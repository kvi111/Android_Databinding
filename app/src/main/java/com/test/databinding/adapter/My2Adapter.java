package com.test.databinding.adapter;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.test.databinding.BR;
import com.test.databinding.R;
import com.test.databinding.model.TestInfo2;

import java.util.List;


public class My2Adapter extends BaseAdapter {
    private List<TestInfo2> data;
    private LayoutInflater layoutInflater;
    private Context context;

    public My2Adapter(Context context, List<TestInfo2> data) {
        this.context = context;
        this.data = data;
        this.layoutInflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return data.size();
    }

    /**
     * 获得某一位置的数据
     */
    @Override
    public TestInfo2 getItem(int position) {
        return data.get(position);
    }

    /**
     * 获得唯一标识
     */
    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewDataBinding binding = null;
        if (convertView == null) {
            binding = DataBindingUtil.inflate(LayoutInflater.from(context), R.layout.listview_item2, parent, false);
        } else {
            binding = DataBindingUtil.getBinding(convertView);
        }
        binding.setVariable(BR.testinfo21, data.get(position));
        return binding.getRoot();
    }
}