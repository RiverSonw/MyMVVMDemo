package com.eddardgao.mydatabindingdemo.bean;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import java.util.List;

/**
 * @Author EddardGao
 * @Email 754231090@qq.com
 * @Date 2019/5/20
 * @describe ::
 * @Version ::
 */
public abstract class BaseBindRecyclerViewAdapter<T> extends RecyclerView.Adapter {

    public List<T> mList;
    public LayoutInflater inflater;

    public BaseBindRecyclerViewAdapter(Context context, List<T> mList) {
        this.mList = mList;
        this.inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return onCreateMyViewHolder(parent, viewType);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int position) {
        onBindMyViewHolder(viewHolder, position);
    }

    //获取Item 布局
    public abstract RecyclerView.ViewHolder onCreateMyViewHolder(ViewGroup parent, int viewType);

    //绑定数据
    public abstract void onBindMyViewHolder(RecyclerView.ViewHolder holder, int position);
}
