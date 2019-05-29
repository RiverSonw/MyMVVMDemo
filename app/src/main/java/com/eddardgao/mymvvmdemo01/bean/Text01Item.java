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
public class Text01Item extends BaseObservable implements IBaseBindingAdapterItem {

    private String text;

    public Text01Item(String text) {
        this.text = text;
    }

    //注解绑定，可以在xml中直接获取
    @Bindable
    public String getText() {
        return text;
    }


    public void setText(String text) {
        this.text = text;
        notifyPropertyChanged(BR.item0501);

    }

    @Override
    public int getItemViewType() {
        return R.layout.item_recycler_text01;
    }


}
