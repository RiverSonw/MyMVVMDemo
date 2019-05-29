package com.eddardgao.mydatabindingdemo.helper;

import android.widget.TextView;

import com.eddardgao.mydatabindingdemo.bean.UserBean;

/**
 * @Author EddardGao
 * @Email 754231090@qq.com
 * @Date 2019/5/20
 * @describe ::
 * @Version ::
 */
public class MultiDataHelper {

    //@BindingAdapter({"multidata"})
    public static void setMultiData(TextView textView , UserBean userBean){
        textView.setText("姓名 :"+userBean.getUserName() +"  性别:"+ userBean.getUserSex());
    }


}
