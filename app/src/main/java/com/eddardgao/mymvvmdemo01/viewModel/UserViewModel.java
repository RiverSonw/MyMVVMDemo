package com.eddardgao.mymvvmdemo01.viewModel;

import android.util.Log;

import com.eddardgao.mymvvmdemo01.util.Contants;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.FormBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

/**
 * @Author EddardGao
 * @Email 754231090@qq.com
 * @Date 2019/5/21
 * @describe ::
 * @Version ::
 */
public class UserViewModel{

    public String st_callback;

    public String TAG = "UserViewModel";

    public IModelCallBack callBack;

    private OkHttpClient client;

    public void  doUserLogin(String UserId,String password){
        Log.d(TAG, "doUserLogin: 执行了doUserLogin 的方法");

        RequestBody requestBody = new FormBody.Builder()
                .add("username","admin")
                .add("password","123")
                .build();

        Request request  = new Request.Builder()
                .url(Contants.USER_LOGIN)
                .post(requestBody)
                .build();
        client = new OkHttpClient();
        Call call  = client.newCall(request);
        call.enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                callBack.onFailure(e);
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                callBack.onSuccess(response.toString());
            }
        });

    }

    public void listenerCallBack(IModelCallBack callBack){
        this.callBack = callBack;
    }


}
