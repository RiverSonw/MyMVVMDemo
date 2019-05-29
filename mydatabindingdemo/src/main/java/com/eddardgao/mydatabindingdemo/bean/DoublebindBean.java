package com.eddardgao.mydatabindingdemo.bean;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.eddardgao.mydatabindingdemo.BR;


/**
 * @Author EddardGao
 * @Email 754231090@qq.com
 * @Date 2019/5/19
 * @describe ::
 * @Version ::
 */
public class DoublebindBean extends BaseObservable {

    private UserBean userBean ;

    public DoublebindBean (UserBean userBean){
        this.userBean = userBean;
    }

    @Bindable
    public UserBean getUserBean(){
        return userBean;
    }

    public void setUserBean(UserBean userBean){
        this.userBean = userBean;
        notifyPropertyChanged(BR.doubleBindBean);
    }





}
