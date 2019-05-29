package com.eddardgao.mymvvmdemo01.handler;

import android.content.Intent;
import android.view.View;

import com.eddardgao.mymvvmdemo01.activity.Test01Activity;
import com.eddardgao.mymvvmdemo01.activity.Test02Activity;
import com.eddardgao.mymvvmdemo01.activity.Test03Activity;
import com.eddardgao.mymvvmdemo01.activity.Test04Activity;
import com.eddardgao.mymvvmdemo01.activity.Test05Activity;
import com.eddardgao.mymvvmdemo01.activity.Test06Activity;
import com.eddardgao.mymvvmdemo01.activity.Test07Activity;

/**
 * @Author EddardGao
 * @Email 754231090@qq.com
 * @Date 2019/5/21
 * @describe ::
 * @Version ::
 */
public class OnMainClickHandler {


    /**
     * 跳转到Test01Activity
     *
     * @param view
     */
    public void onClickToTest01(View view) {
        Intent intent = new Intent(view.getContext(), Test01Activity.class);
        view.getContext().startActivity(intent);
    }


    public void onClickToTest02(View view){
        Intent intent = new Intent(view.getContext(), Test02Activity.class);
        view.getContext().startActivity(intent);
    }

    public void onClickToTest03(View view){
        Intent intent = new Intent(view.getContext(), Test03Activity.class);
        view.getContext().startActivity(intent);
    }

    public void onClickToTest04(View view){
        Intent intent = new Intent(view.getContext(), Test04Activity.class);
        view.getContext().startActivity(intent);
    }

    public void onClickToTest05(View view){
        Intent intent = new Intent(view.getContext(), Test05Activity.class);
        view.getContext().startActivity(intent);
    }

    public void onClickToTest06(View view){
        Intent intent = new Intent(view.getContext(), Test06Activity.class);
        view.getContext().startActivity(intent);
    }

    public void onClickToTest07(View view){
        Intent intent = new Intent(view.getContext(), Test07Activity.class);
        view.getContext().startActivity(intent);
    }

}
