package com.eddardgao.mymvvmdemo01.adapter;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.PagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author EddardGao
 * @Email 754231090@qq.com
 * @Date 2019/5/30
 * @describe ::
 * @Version ::
 */
public class MyFragmentStatePagerAdapter extends FragmentStatePagerAdapter {
    private List<Fragment> fragments = new ArrayList<>();
    private List<String> titles = new ArrayList<>();


    public MyFragmentStatePagerAdapter(FragmentManager fm) {
        super(fm);
    }

    public void  setData(List<Fragment> fragments,List<String> titles){
        this.fragments = fragments;
        this.titles = titles;
    }


    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public int getCount() {
        return fragments.size();
    }


    @Override
    public int getItemPosition(@NonNull Object object) {
        return PagerAdapter.POSITION_NONE;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return titles.get(position);
    }

    /**
     * 清理Adapter
     */
    public void notifyDataChanged(){
        this.fragments = null;
        this.titles = null;
    }


}
