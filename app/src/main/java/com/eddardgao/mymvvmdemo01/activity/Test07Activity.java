package com.eddardgao.mymvvmdemo01.activity;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentActivity;

import com.eddardgao.mymvvmdemo01.R;
import com.eddardgao.mymvvmdemo01.databinding.ActivityTest07Binding;

public class Test07Activity extends FragmentActivity {

    private ActivityTest07Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_test07);






        binding.tabLayout.setupWithViewPager(binding.viewPager);
        binding.tabLayout.addOnTabSelectedListener(new TabLayout.BaseOnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                binding.viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

    }



}
