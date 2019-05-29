package com.eddardgao.mymvvmdemo01.adapter;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.eddardgao.mymvvmdemo01.R;
import com.eddardgao.mymvvmdemo01.bean.BaseBindRecyclerViewAdapter;
import com.eddardgao.mymvvmdemo01.bean.IBaseBindingAdapterItem;
import com.eddardgao.mymvvmdemo01.bean.Text01Item;
import com.eddardgao.mymvvmdemo01.bean.Text02Item;
import com.eddardgao.mymvvmdemo01.databinding.ItemRecyclerText01Binding;
import com.eddardgao.mymvvmdemo01.databinding.ItemRecyclerText02Binding;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author EddardGao
 * @Email 754231090@qq.com
 * @Date 2019/5/28
 * @describe ::
 * @Version ::
 */
public class MultiItemAdapter extends BaseBindRecyclerViewAdapter<IBaseBindingAdapterItem> {

    public OnItemClickListener listener;


    public MultiItemAdapter(Context context, List<IBaseBindingAdapterItem> mList) {
        super(context, mList);
    }

    @Override
    public int getItemViewType(int position) {
        return mList.get(position).getItemViewType();
    }

    @Override
    public RecyclerView.ViewHolder onCreateMyViewHolder(ViewGroup parent, int viewType) {
        switch (viewType) {
            case R.layout.item_recycler_text01:
                ItemRecyclerText01Binding itemtext01 = DataBindingUtil.inflate(inflater, R.layout.item_recycler_text01, parent, false);
                return new Text0501ViewHolder(itemtext01);
            case R.layout.item_recycler_text02:
                ItemRecyclerText02Binding itemtext02 = DataBindingUtil.inflate(inflater,R.layout.item_recycler_text02,parent,false);
                return new Text0502ViewHolder(itemtext02);
            default:
                ItemRecyclerText01Binding binding = DataBindingUtil.inflate(inflater, R.layout.item_recycler_text01, parent, false);
                return new Text0501ViewHolder(binding);
        }
    }

    @Override
    public void onBindMyViewHolder(RecyclerView.ViewHolder holder, final int position) {
        if(holder instanceof  Text0501ViewHolder){
            Text01Item text01Itembean = (Text01Item) mList.get(position);
            ((Text0501ViewHolder) holder).getBinding().setItem0501(text01Itembean);
            ((Text0501ViewHolder) holder).getBinding().executePendingBindings();        //解决databinding 闪烁问题
            ((Text0501ViewHolder) holder).getBinding().linItemText01.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    listener.onItem01Clicked(position);
                }
            });

        }else if(holder instanceof Text0502ViewHolder){
            Text02Item text02Itembean = (Text02Item) mList.get(position);
            ((Text0502ViewHolder) holder).getBinding().setItem0502(text02Itembean);
            ((Text0502ViewHolder) holder).getBinding().executePendingBindings();        //解决databinding 闪烁问题

            ((Text0502ViewHolder) holder).getBinding().linItemText02.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    listener.onItem02Clicked(position);
                }
            });
        }
    }


    /**
     * 数据置空操作，
     */
    @Override
    public void reseDatas() {
        mList = new ArrayList<>();
    }


    /**
     * 添加尾部数据的操作
     */
    @Override
    public void addTail() {
        Toast.makeText(mContext,"Add Tail 方法被调用了",Toast.LENGTH_SHORT).show();



    }

    @Override
    public void addHead() {

    }


    /**
     * Text0501ViewHolder
     * 只传入一个String
     */
    class Text0501ViewHolder extends RecyclerView.ViewHolder {
        private ItemRecyclerText01Binding binding;

        /**
         * ItemRecyclerText01Binding  在创建完成xml 并带入<data></data>节点之后。自动生成的类
         */
        public ItemRecyclerText01Binding getBinding() {
            return binding;
        }

        public Text0501ViewHolder(ItemRecyclerText01Binding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }

    /**
     * Text0502ViewHolder
     * 传入一个 UserBean
     */
    class Text0502ViewHolder extends RecyclerView.ViewHolder {

        private ItemRecyclerText02Binding binding;

        public ItemRecyclerText02Binding getBinding() {
            return binding;
        }

        public Text0502ViewHolder(ItemRecyclerText02Binding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }

    /**
     *  OnItemClickListener ，控件被点击的事件接口
     */
    public interface OnItemClickListener{

        void onItem01Clicked(int position);

        void onItem02Clicked(int position);

    }

    public void setOnItemClickListener(OnItemClickListener listener){
        this.listener = listener;
    }


}
