package com.eddardgao.mymvvmdemo01.service;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;

import com.eddardgao.mymvvmdemo01.bean.UserBean;
import com.eddardgao.mymvvmdemo01.viewModel.IModelCallBack;
import com.eddardgao.mymvvmdemo01.viewModel.IUserViewModel;
import com.eddardgao.mymvvmdemo01.viewModel.UserViewModel;

import java.io.IOException;

public class Test01DataService extends Service {
    private String TAG = "Test01DataService";
    private IBinder binder = new Test01DataServiceBinder();



    public Test01DataService() {
        Log.d(TAG, "Test01DataService: 被实例化了");
    }

    @Override
    public IBinder onBind(Intent intent) {
        return binder;
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }

    @Override
    public boolean onUnbind(Intent intent) {
        return super.onUnbind(intent);
    }


    /**
     * 执行Activity 传递过来的事件    返回相应的数据
     *      通过BoradCast  广播数据Databinding
     */
    public class Test01DataServiceBinder extends Binder implements IUserViewModel {

        public Test01DataService getService(){
            return Test01DataService.this;
        }

        @Override
        public void UserLogin(String UserId, String password) {
            UserViewModel userViewModel;
            if(isloginthreadOP){

                userViewModel = new UserViewModel();
                userViewModel.doUserLogin("admin","1234");
                userViewModel.listenerCallBack(new IModelCallBack() {
                    @Override
                    public void onFailure(IOException e) {
                        System.out.println("失败");
                    }

                    @Override
                    public void onSuccess(Object object) {
                        sendDataBroadcast("11111");
                    }
                });
            }


        }

        @Override
        public boolean UserLogout() {
            return false;
        }

        @Override
        public UserBean GetUserInfo() {
            return null;
        }

    }

    protected void sendDataBroadcast(String callback){

        UserBean userBean = new UserBean("王小二","123456","12",23);

        Intent intent = new Intent();
        intent.setAction("com.eddardgao.test01servicecallback.content");
        intent.putExtra("callback",callback);
        intent.putExtra("userinfo",userBean);


        sendBroadcast(intent);
    }



}
