package com.eddardgao.mydatabindingdemo.activity;

import android.app.Activity;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.OrientationHelper;

import com.eddardgao.mydatabindingdemo.R;
import com.eddardgao.mydatabindingdemo.adapter.MultiItemAdapter;
import com.eddardgao.mydatabindingdemo.bean.IBaseBindingAdapterItem;
import com.eddardgao.mydatabindingdemo.bean.Text01Item;
import com.eddardgao.mydatabindingdemo.bean.Text02Item;
import com.eddardgao.mydatabindingdemo.bean.UserBean;
import com.eddardgao.mydatabindingdemo.databinding.ActivityTest03Binding;

import java.util.ArrayList;
import java.util.List;

public class Test03Activity extends Activity {

    private MultiItemAdapter mAdapter;

    private List<IBaseBindingAdapterItem> mList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityTest03Binding binding = DataBindingUtil.setContentView(this,R.layout.activity_test03);

        initData();
        mAdapter = new MultiItemAdapter(this,mList);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this, OrientationHelper.VERTICAL,false);
        binding.recyclerText03.setLayoutManager(layoutManager);
        binding.recyclerText03.setAdapter(mAdapter);
    }

    private void initData() {
        mList.add(new Text01Item("哦哈哈哈哈"));
        mList.add(new Text01Item("哦哈哈哈哈"));
        mList.add(new Text01Item("哦哈哈哈哈"));
        mList.add(new Text02Item(new UserBean("王二","男" ,23)));
        mList.add(new Text02Item(new UserBean("死亡如风","男" ,23)));
        mList.add(new Text02Item(new UserBean("常伴吾身","男" ,23)));
        mList.add(new Text01Item("巴拉巴拉巴拉"));
        mList.add(new Text01Item("噜啦啦啦"));
        mList.add(new Text02Item(new UserBean("死亡如风","男" ,23)));
        mList.add(new Text02Item(new UserBean("常伴吾身","男" ,23)));

    }


}
