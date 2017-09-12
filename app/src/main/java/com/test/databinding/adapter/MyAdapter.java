package com.test.databinding.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.test.databinding.R;
import com.test.databinding.model.TestInfo;

import java.util.List;

public class MyAdapter extends BaseAdapter {

    private List<TestInfo> data;
    private LayoutInflater layoutInflater;
    private Context context;

    public MyAdapter(Context context, List<TestInfo> data) {
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
    public Object getItem(int position) {
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
        if (convertView == null) {
            convertView = layoutInflater.inflate(R.layout.listview_item, null);
        }

        ImageView image = (ImageView) convertView.findViewById(R.id.image);
        TextView title = (TextView) convertView.findViewById(R.id.title);
        TextView info = (TextView) convertView.findViewById(R.id.info);
        //Button view = (Button) convertView.findViewById(R.id.buttonview);

        //绑定数据
        image.setBackgroundResource(data.get(position).getImage());
        title.setText((String) data.get(position).getTitle());
        info.setText((String) data.get(position).getInfo());
        return convertView;
    }
}