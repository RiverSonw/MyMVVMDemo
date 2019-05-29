package com.eddardgao.mymvvmdemo01.viewModel;

import android.content.Context;
import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.support.v4.widget.SwipeRefreshLayout;
import android.view.View;
import android.widget.Toast;

import com.eddardgao.mymvvmdemo01.BR;
import com.eddardgao.mymvvmdemo01.adapter.MultiItemAdapter;
import com.eddardgao.mymvvmdemo01.bean.IBaseBindingAdapterItem;
import com.eddardgao.mymvvmdemo01.bean.Text01Item;
import com.eddardgao.mymvvmdemo01.bean.Text02Item;
import com.eddardgao.mymvvmdemo01.bean.UserBean;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author EddardGao
 * @Email 754231090@qq.com
 * @Date 2019/5/28
 * @describe ::
 * @Version ::
 */
public class Test05ViewModel extends BaseObservable implements MultiItemAdapter.OnItemClickListener {

    public List<IBaseBindingAdapterItem> mList = new ArrayList<>();

    public MultiItemAdapter adapter ;

    private Context mContext;


    public Test05ViewModel(Context mContext){
        this.mContext = mContext;
        initList();
    }

    public List<IBaseBindingAdapterItem> getmList(){
        return mList;
    }


    /**
     * 返回RecyclerView Adapter
     * @return
     */
    @Bindable
    public MultiItemAdapter getAdapter (){
        adapter =new MultiItemAdapter(mContext,this.mList);

        adapter.setOnItemClickListener(this);

        return adapter;
    }

    /**
     * 尾部添加 新的List
     *
     *
     */
    public void addAdapterTail(SwipeRefreshLayout swiperefresh){
        //this.mList.addAll(mList);
        //adapter = new MultiItemAdapter(mContext,this.mList);
        //notifyPropertyChanged(BR.test05viewmodel);




        /**
         * 传递进来的   swiperefresh 可以执行操作
         */
        swiperefresh.setRefreshing(false);


    }

    /**
     * 头部添加新的List
     *
     */
    public void addAdapterHead(List<IBaseBindingAdapterItem> mList){
        mList.addAll(this.mList);
        adapter = new MultiItemAdapter(mContext,mList);
        notifyPropertyChanged(BR.test05viewmodel);
    }

    /**
     * 初始化 列表的信息，
     */
    public void initList(){
        mList.add(new Text01Item("哦哈哈哈哈"));
        mList.add(new Text01Item("哦哈哈哈哈"));
        mList.add(new Text01Item("哦哈哈哈哈"));
        mList.add(new Text02Item(new UserBean("王二","100","男" ,23)));
        mList.add(new Text02Item(new UserBean("死亡如风","100","男" ,23)));
        mList.add(new Text02Item(new UserBean("常伴吾身","100","男" ,23)));
        mList.add(new Text01Item("巴拉巴拉巴拉"));
        mList.add(new Text01Item("噜啦啦啦"));
        mList.add(new Text02Item(new UserBean("死亡如风","100","男" ,23)));
        mList.add(new Text02Item(new UserBean("常伴吾身","100","男" ,23)));
    }


    public void FloatButtonClickListener(View view){
        Toast.makeText(mContext,"固定Button 被点击了",Toast.LENGTH_SHORT).show();

    }



    /**
     * RecyclerView 的点击事件回调
     * @param position
     */
    @Override
    public void onItem01Clicked(int position) {
        Toast.makeText(mContext,"ITEM 01 被点击了  Position ==== " +position,Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onItem02Clicked(int position) {
        Toast.makeText(mContext,"ITEM 02 被点击了  Position ==== " +position,Toast.LENGTH_SHORT).show();
    }
}
