package com.eddardgao.mymvvmdemo01.base;

import android.app.Application;
import android.content.Context;

/**
 * @Author EddardGao
 * @Email 754231090@qq.com
 * @Date 2019/5/21
 * @describe ::
 * @Version ::
 */
public class MyApplication extends Application {

    private static Context mContext;

    public static  Context getContext(){
        return mContext;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        this.mContext = getApplicationContext();
    }

}
