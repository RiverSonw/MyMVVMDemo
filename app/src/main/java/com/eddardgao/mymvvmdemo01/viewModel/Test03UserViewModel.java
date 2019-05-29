package com.eddardgao.mymvvmdemo01.viewModel;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.text.Editable;

import com.eddardgao.mymvvmdemo01.BR;

/**
 * @Author EddardGao
 * @Email 754231090@qq.com
 * @Date 2019/5/24
 * @describe ::
 * @Version ::
 */
public class Test03UserViewModel extends BaseObservable {

    public String stt03;

    @Bindable
    public String getStt03() {
        return stt03;
    }

    public void setStt03(String stt03) {
        this.stt03 = stt03;
        notifyPropertyChanged(BR.stt03);
    }


    public void onStt03Changed(Editable s){
       System.out.println("获取到了点击事件  ===" + s.toString() );
        setStt03(s.toString());
    }






}
