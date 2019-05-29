package com.eddardgao.mymvvmdemo01.activity;

import android.app.Activity;
import android.databinding.DataBindingUtil;
import android.os.Bundle;

import com.eddardgao.mymvvmdemo01.R;
import com.eddardgao.mymvvmdemo01.databinding.ActivityTest03Binding;
import com.eddardgao.mymvvmdemo01.viewModel.Test03UserViewModel;

public class Test03Activity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityTest03Binding binding = DataBindingUtil.setContentView(this,R.layout.activity_test03);
        Test03UserViewModel viewModel = new Test03UserViewModel();
        binding.setTest03vm(viewModel);


    }



}
