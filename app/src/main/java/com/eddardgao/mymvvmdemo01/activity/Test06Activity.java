package com.eddardgao.mymvvmdemo01.activity;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;

import com.eddardgao.mymvvmdemo01.R;
import com.eddardgao.mymvvmdemo01.databinding.ActivityTest06Binding;
import com.eddardgao.mymvvmdemo01.fragment.Test06Fragment;

public class Test06Activity extends FragmentActivity {

    private FragmentTransaction fragmentTransaction;

    private Fragment test06fragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityTest06Binding binding = DataBindingUtil.setContentView(this,R.layout.activity_test06);

        test06fragment = new Test06Fragment();
        fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.fl_test06,test06fragment).commit();

    }



}
