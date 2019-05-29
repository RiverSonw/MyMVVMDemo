package com.eddardgao.mydatabindingdemo.handler;

import android.content.Intent;
import android.view.View;

import com.eddardgao.mydatabindingdemo.MyApplication;
import com.eddardgao.mydatabindingdemo.activity.Test02Activity;

/**
 * @Author EddardGao
 * @Email 754231090@qq.com
 * @Date 2019/5/18
 * @describe ::
 * @Version ::
 *
 *  类名必须以大写字符开头。。。。我居然忘掉了。。
 *
 */
public class OnClickHandler {
    public void onClickNow(View view){
        Intent intent = new Intent(MyApplication.getContext(), Test02Activity.class);
        MyApplication.getContext().startActivity(intent);
    }
}