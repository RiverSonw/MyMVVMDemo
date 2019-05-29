package com.eddardgao.mydatabindingdemo.bean;

import android.databinding.ObservableField;

/**
 * @Author EddardGao
 * @Email 754231090@qq.com
 * @Date 2019/5/19
 * @describe ::
 * @Version ::
 */
public class DoublebindBean2  {

    public final ObservableField<UserBean> userBeanObservableField = new ObservableField<>();

    public DoublebindBean2(UserBean userBean){
        this.userBeanObservableField.set(userBean);
    }

    public void setUserBean(UserBean userBean){
        this.userBeanObservableField.set(userBean);
        System.out.println("DoublebindBean2  的数据修改了");
    }

    public UserBean getUserBean (){
        System.out.println("触发了DoublebindBean2的数据获取方法");
        return this.userBeanObservableField.get();
    }


}
