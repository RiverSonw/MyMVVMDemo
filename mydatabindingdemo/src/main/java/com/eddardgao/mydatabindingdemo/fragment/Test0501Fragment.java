package com.eddardgao.mydatabindingdemo.fragment;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.eddardgao.mydatabindingdemo.R;
import com.eddardgao.mydatabindingdemo.databinding.FragmentTest0501Binding;

/**
 * @Author EddardGao
 * @Email 754231090@qq.com
 * @Date 2019/5/20
 * @describe ::
 * @Version ::
 */
public class Test0501Fragment extends Fragment {


    private View view;
    private FragmentTest0501Binding binding;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    /**
     * 初始化View的方法,,返回一个View
     * @param inflater
     * @param container
     * @param savedInstanceState
     * @return
     */
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_test05_01,container,false);

        view = binding.getRoot();
        return view;

    }

    /**
     * 初始化数据的获取操作
     * @param savedInstanceState
     */
    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        String fragment_text0501 = "FragmentTest";
        binding.setText0501(fragment_text0501);


    }


}
