package com.test.databinding.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.test.databinding.R;
import com.test.databinding.model.TestInfo2;

import java.util.List;


public class BaseAdapter extends RecyclerView.Adapter<BaseAdapter.MyViewHolder> {

    private Context mContext;
    private List<TestInfo2> mData;

    //自定义点击事件和长按事件
    private OnItemClickListener mOnItemClickListener;

    public void setOnItemClickListener(OnItemClickListener mOnItemClickListener)
    {
        this.mOnItemClickListener = mOnItemClickListener;
    }

    //构造器
    public BaseAdapter(Context mContext, List<TestInfo2> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }
    //加载布局
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        MyViewHolder holder = new MyViewHolder(LayoutInflater.from(mContext).inflate(R.layout.item_base, parent, false));
        return holder;
    }
    //为布局加载数据
    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.tv_text.setText(mData.get(position).getTitle());
        holder.tv_image.setText(String.valueOf(mData.get(position).getImage()));
        setClickListener(holder,position);
    }
    //设置点击事件
    private void setClickListener(final MyViewHolder holder, int position) {
        if(mOnItemClickListener!=null){
            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int pos = holder.getLayoutPosition()-1;//默认是第一个开始
                    mOnItemClickListener.onItemClick(holder.itemView, pos);
                }
            });
        }

        holder.itemView.setOnLongClickListener(new View.OnLongClickListener()
        {
            @Override
            public boolean onLongClick(View v)
            {
                int pos = holder.getLayoutPosition()-1;//默认是第一个开始
                mOnItemClickListener.onItemLongClick(holder.itemView, pos);
                return true;//返回true可以屏蔽点击监听的响应
            }
        });
    }

    //总共多少个项
    @Override
    public int getItemCount() {
        return mData.size();
    }
    //初始化布局信息
    class MyViewHolder extends RecyclerView.ViewHolder{
        TextView tv_text;
        TextView tv_image;
        public MyViewHolder(View itemView) {
            super(itemView);
            tv_text = (TextView) itemView.findViewById(R.id.tv_text);
            tv_image = (TextView) itemView.findViewById(R.id.tv_image);
        }
    }

//    //添加
//    public void addData(int position) {
//        mData.add(position, "Insert One");
//        notifyItemInserted(position);
//    }
    //删除
//    public void removeData(int position) {
//        mData.remove(position);
//        notifyItemRemoved(position);
//    }
}
