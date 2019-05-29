package com.eddardgao.mydatabindingdemo;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * @author RiverSonw
 * @version $Rev$
 * @des ${TODO}
 * @updateAuthor $Author
 * @updateDes ${TODO}
 **/
public abstract class BaseFragment extends Fragment {
    protected Context mContext;


    /**
     * 当该类被系统创建时回调
     * @param savedInstanceState
     */
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        mContext=getActivity();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle savedInstanceState) {
        View view = initView(inflater,viewGroup);
        return view;
    }

    /**
     * 抽象类，由孩子实现不同的效果
     * @return
     */
    public abstract View initView(LayoutInflater inflater,ViewGroup viewGroup) ;

    /**
     * 当activity创建后，回调
     * @param savedInstanceState
     */
    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        initData();

    }

    /**
     *
     *当子类需要联网请求数据的时候，可以重写这个方法
     * 在该方法中请求联网数据
     */
    public void initData(){

    }

}
