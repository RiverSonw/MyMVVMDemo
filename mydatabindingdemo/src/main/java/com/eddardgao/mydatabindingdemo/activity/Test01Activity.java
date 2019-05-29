package com.eddardgao.mydatabindingdemo.activity;

import android.app.Activity;
import android.databinding.DataBindingUtil;
import android.os.Bundle;

import com.eddardgao.mydatabindingdemo.R;
import com.eddardgao.mydatabindingdemo.bean.UserBean;
import com.eddardgao.mydatabindingdemo.databinding.ActivityTest01Binding;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Test01Activity extends Activity {

    private String URL = "https://ss0.bdstatic.com/70cFvHSh_Q1YnxGkpoWK1HF6hhy/it/u=4138850978,2612460506&fm=200&gp=0.jpg";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test01);

        ActivityTest01Binding binding = DataBindingUtil.setContentView(this,R.layout.activity_test01);

        UserBean userBean = new UserBean("Eddard","man",15);
        binding.setUser(userBean);

        com.eddardgao.mydatabindingdemo.user.UserBean userBean2 = new com.eddardgao.mydatabindingdemo.user.UserBean("Snow","none",20);
        binding.setUser2(userBean2);

        List<String> list = new ArrayList<>();
        list.add("你好啊");
        list.add("我很好 ，嘿嘿嘿");
        binding.setList(list);

        String[] array = {"字符串1","字符串2"};
        binding.setArray(array);

        HashMap<String,Object> map = new HashMap<>();
        map.put("key0","map0");
        map.put("key1","map1");
        binding.setMap(map);

        int myage = 20;
        binding.setMyage(myage);

        String url = URL;
        binding.setUrl(url);


    }

}
