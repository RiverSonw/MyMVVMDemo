package com.eddardgao.mydatabindingdemo.activity;

import android.app.Activity;
import android.databinding.DataBindingUtil;
import android.databinding.ObservableArrayList;
import android.databinding.ObservableArrayMap;
import android.os.Bundle;
import android.view.View;

import com.eddardgao.mydatabindingdemo.R;
import com.eddardgao.mydatabindingdemo.bean.DoublebindBean;
import com.eddardgao.mydatabindingdemo.bean.DoublebindBean2;
import com.eddardgao.mydatabindingdemo.bean.UserBean;
import com.eddardgao.mydatabindingdemo.databinding.ActivityTest02Binding;

public class Test02Activity extends Activity implements View.OnClickListener {

    private DoublebindBean doublebindBean;
    private UserBean userBean;
    private DoublebindBean2 doublebindBean2;
    private ObservableArrayList<String> list;
    private ObservableArrayMap<String, Object> map;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_test02);

        ActivityTest02Binding binding = DataBindingUtil.setContentView(this, R.layout.activity_test02);

        userBean = new UserBean("张三", "男", 24);
        doublebindBean = new DoublebindBean(userBean);
        binding.setDoubleBindBean(doublebindBean);


        UserBean userBean2 = new UserBean("王小二","女",18);
        doublebindBean2 = new DoublebindBean2(userBean2);
        binding.setDoubleBindBean2(doublebindBean2);

        list = new ObservableArrayList<>();
        list.add("list1");
        list.add("list2");
        binding.setList(list);

        map = new ObservableArrayMap<>();
        map.put("key0","key0_value0");
        map.put("key1","key1_value1");
        binding.setMap(map);

        binding.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.change_content_btn:
                //System.out.println("数据域修改");
                userBean = new UserBean("李四", "女", 26);
                doublebindBean.setUserBean(userBean);
                break;
            case R.id.change_content_btn2:
                userBean = new UserBean("黄金","女",25);
                doublebindBean2.setUserBean(userBean);
                break;
            case R.id.change_content_btn3:
                list.set(0, "after change list");
                break;
            case R.id.change_content_btn4:
                map.put("key0", "after change key0_value0");
                break;

        }
    }
}
