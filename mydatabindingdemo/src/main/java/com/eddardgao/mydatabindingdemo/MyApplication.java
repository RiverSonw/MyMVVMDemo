package com.eddardgao.mydatabindingdemo;

import android.app.Application;
import android.content.Context;

/**
 * @Author EddardGao
 * @Email 754231090@qq.com
 * @Date 2019/5/18
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
