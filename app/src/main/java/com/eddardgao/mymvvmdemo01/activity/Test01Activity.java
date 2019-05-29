package com.eddardgao.mymvvmdemo01.activity;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.ServiceConnection;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.eddardgao.mymvvmdemo01.R;
import com.eddardgao.mymvvmdemo01.bean.UserBean;
import com.eddardgao.mymvvmdemo01.databinding.ActivityTest01Binding;
import com.eddardgao.mymvvmdemo01.service.Test01DataService;
import com.eddardgao.mymvvmdemo01.viewModel.IUserViewModel;


public class Test01Activity extends Activity {

    private String TAG = "Test01Activity";
    private Intent serviceIntent;
    private IUserViewModel iUserViewModel;
    private Test01DataService mService;
    private Test01DataConnect connect;

    private UserBean userBean;
    private Test01ContentReceiver mReceiver;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityTest01Binding binding = DataBindingUtil.setContentView(this, R.layout.activity_test01);

        serviceIntent = new Intent(this,Test01DataService.class);
        connect = new Test01DataConnect() ;
        bindService(serviceIntent,connect,BIND_AUTO_CREATE);


        userBean = new UserBean("","","",23);
        binding.setUserbean(userBean);

        mReceiver = new Test01ContentReceiver();
        IntentFilter filter = new IntentFilter("com.eddardgao.test01servicecallback.content");
        registerReceiver(mReceiver,filter);

    }

    public void login(View view) {
        System.out.println("UserName === "+userBean.getUserName() +" Password===" + userBean.getPassword() );


        iUserViewModel.UserLogin(userBean.getUserName(), userBean.getPassword());

    }


    public class Test01DataConnect implements ServiceConnection{

        @Override
        public void onServiceConnected(ComponentName name, IBinder service) {
            iUserViewModel  = (IUserViewModel)service;
            mService = ((Test01DataService.Test01DataServiceBinder) service).getService();

        }

        @Override
        public void onServiceDisconnected(ComponentName name) {
            Log.d(TAG, "onServiceDisconnected: 关闭Service 连接");
        }
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    public class Test01ContentReceiver extends BroadcastReceiver{

        @Override
        public void onReceive(Context context, Intent intent) {
            String callback = intent.getStringExtra("callback");
            UserBean userBean = (UserBean)intent.getSerializableExtra("userinfo");
            Log.d(TAG, "onReceive: Activity获取到了UserInfo ===" +userBean.getUserName());
            Toast.makeText(Test01Activity.this,callback,Toast.LENGTH_SHORT).show();
        }
    }


}
