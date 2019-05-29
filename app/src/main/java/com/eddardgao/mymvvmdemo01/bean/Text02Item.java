package com.eddardgao.mymvvmdemo01.bean;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.android.databinding.library.baseAdapters.BR;
import com.eddardgao.mymvvmdemo01.R;


/**
 * @Author EddardGao
 * @Email 754231090@qq.com
 * @Date 2019/5/20
 * @describe ::
 * @Version ::
 */
public class Text02Item extends BaseObservable implements IBaseBindingAdapterItem {
    private UserBean userBean;

    public Text02Item(UserBean userBean){
        this.userBean = userBean;
    }

    @Bindable
    public UserBean getUserBean() {
        return userBean;
    }

    public void setUserBean(UserBean userBean) {
        this.userBean = userBean;
        notifyPropertyChanged(BR.item0502);
    }

    @Override
    public int getItemViewType() {
        return R.layout.item_recycler_text02;
    }

}
