package com.eddardgao.mydatabindingdemo.activity;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;

import com.eddardgao.mydatabindingdemo.R;
import com.eddardgao.mydatabindingdemo.databinding.ActivityTest05Binding;
import com.eddardgao.mydatabindingdemo.fragment.Test0501Fragment;

public class Test05Activity extends FragmentActivity {

    private FragmentTransaction fragmentManager ;

    private Fragment baseFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityTest05Binding binding = DataBindingUtil.setContentView(this,R.layout.activity_test05);

        baseFragment = new Test0501Fragment();
        fragmentManager = getSupportFragmentManager().beginTransaction();

        fragmentManager.replace(R.id.fragment_test05,baseFragment).commit();


    }


}
