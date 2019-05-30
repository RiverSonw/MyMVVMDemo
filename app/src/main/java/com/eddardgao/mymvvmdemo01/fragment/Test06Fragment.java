package com.eddardgao.mymvvmdemo01.fragment;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.eddardgao.mymvvmdemo01.R;
import com.eddardgao.mymvvmdemo01.databinding.FragmentTest06Binding;
import com.eddardgao.mymvvmdemo01.viewModel.Test06FragmentVM;

/**
 * @Author EddardGao
 * @Email 754231090@qq.com
 * @Date 2019/5/29
 * @describe ::
 * @Version ::
 */
public class Test06Fragment extends Fragment {

    private View view;
    private FragmentTest06Binding binding;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    /**
     * 可以进行View层初始化操作
     * @param inflater
     * @param container
     * @param savedInstanceState
     * @return
     */
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_test06,container,false);
        view = binding.getRoot();

        return view;

    }


    /**
     * 可以执行 bundle数据拉取，
     * @param savedInstanceState
     */
    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        Test06FragmentVM test06FragmentVM = new Test06FragmentVM();
        test06FragmentVM.setUserName("我是Test06FragmentVM");

        binding.setFragmentvm(test06FragmentVM);
    }


}
