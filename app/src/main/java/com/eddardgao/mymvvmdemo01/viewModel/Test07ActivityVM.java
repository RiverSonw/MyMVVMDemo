package com.eddardgao.mymvvmdemo01.viewModel;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;

import com.eddardgao.mymvvmdemo01.adapter.MyFragmentStatePagerAdapter;
import com.eddardgao.mymvvmdemo01.fragment.Test0701Fragment;
import com.eddardgao.mymvvmdemo01.fragment.Test0702Fragment;
import com.eddardgao.mymvvmdemo01.fragment.Test0703Fragment;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author EddardGao
 * @Email 754231090@qq.com
 * @Date 2019/5/29
 * @describe ::
 * @Version ::
 */
public class Test07ActivityVM {


    List<String> title_list ;

    List<Fragment> fragments;

    public MyFragmentStatePagerAdapter adapter ;

    public Test07ActivityVM(FragmentManager fm){
        title_list= new ArrayList<>();

        title_list.add("方法");
        title_list.add("实践");
        title_list.add("系统");

        fragments = new ArrayList<>();
        fragments.add(new Test0701Fragment());
        fragments.add(new Test0702Fragment());
        fragments.add(new Test0703Fragment());



        adapter = new MyFragmentStatePagerAdapter(fm);
        adapter.setData(fragments,title_list);

    }





}
