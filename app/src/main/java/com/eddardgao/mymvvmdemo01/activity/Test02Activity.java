package com.eddardgao.mymvvmdemo01.activity;

import android.app.Activity;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.view.View;

import com.eddardgao.mymvvmdemo01.R;
import com.eddardgao.mymvvmdemo01.bean.UserBean;
import com.eddardgao.mymvvmdemo01.databinding.ActivityTest02Binding;
import com.eddardgao.mymvvmdemo01.viewModel.Test02UserViewModel;

public class Test02Activity extends Activity implements View.OnClickListener{


    private String TAG = "Test02Activity";
    private Test02UserViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityTest02Binding binding = DataBindingUtil.setContentView(this, R.layout.activity_test02);

        viewModel = new Test02UserViewModel();
        UserBean userBean = new UserBean();
        userBean.setUserName("我是测试用的原型数据");
        viewModel.setObUserBean(userBean);
        binding.setUserViewModel(viewModel);

        UserBean userBean1 = new UserBean();
        userBean1.setUserName("我来了，你认输吧");
        viewModel.setObUserBean(userBean1);



    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.bt_0202){
            System.out.println("出发了第二个Button 的点击事件");
            viewModel.setMyString("你好我是：：：：新的");
        }

    }


}
