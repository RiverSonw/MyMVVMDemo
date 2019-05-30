package com.eddardgao.mymvvmdemo01.fragment;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.eddardgao.mymvvmdemo01.R;
import com.eddardgao.mymvvmdemo01.databinding.FragmentTest07Binding;
import com.eddardgao.mymvvmdemo01.viewModel.Test0701FragmentVM;

/**
 * @Author EddardGao
 * @Email 754231090@qq.com
 * @Date 2019/5/29
 * @describe ::
 * @Version ::
 */
public class Test0702Fragment extends Fragment {

    private FragmentTest07Binding binding;
    private View view;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_test07, container, false);
        view = binding.getRoot();
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);


        Test0701FragmentVM vm = new Test0701FragmentVM(2);
        binding.setFragment07vm(vm);
        System.out.println("Test0701Fragment 被初始化了");
    }

}
