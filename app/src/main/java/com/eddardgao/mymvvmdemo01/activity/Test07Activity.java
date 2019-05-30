package com.eddardgao.mymvvmdemo01.activity;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.NestedScrollView;

import com.eddardgao.mymvvmdemo01.R;
import com.eddardgao.mymvvmdemo01.adapter.MyFragmentStatePagerAdapter;
import com.eddardgao.mymvvmdemo01.fragment.Test0701Fragment;
import com.eddardgao.mymvvmdemo01.fragment.Test0702Fragment;
import com.eddardgao.mymvvmdemo01.fragment.Test0703Fragment;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Test07Activity extends FragmentActivity {

    @BindView(R.id.tab_layout)
    TabLayout tabLayout;
    @BindView(R.id.viewPager)
    ViewPager viewPager;
    @BindView(R.id.nestedScrollView)
    NestedScrollView nestedScrollView;

    List<String> title_list;

    List<Fragment> fragments;

    public MyFragmentStatePagerAdapter adapter;

    /**
     * ViewPager + fragments +tablayout + databinding 仍然存在问题。
     *
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test07);
        ButterKnife.bind(this);


        title_list = new ArrayList<>();

        title_list.add("方法");
        title_list.add("实践");
        title_list.add("系统");

        fragments = new ArrayList<>();
        fragments.add(new Test0701Fragment());
        fragments.add(new Test0702Fragment());
        fragments.add(new Test0703Fragment());

        adapter = new MyFragmentStatePagerAdapter(getSupportFragmentManager());
        adapter.setData(fragments, title_list);

        viewPager.setAdapter(adapter);
        viewPager.setOffscreenPageLimit(1);

        tabLayout.setupWithViewPager(viewPager);
        tabLayout.addOnTabSelectedListener(new TabLayout.BaseOnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
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
