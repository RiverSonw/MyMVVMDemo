package com.eddardgao.mymvvmdemo01.viewModel;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.os.Looper;
import android.text.Editable;
import android.view.View;
import android.widget.Toast;

import com.eddardgao.mymvvmdemo01.BR;
import com.eddardgao.mymvvmdemo01.bean.UserBean;
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
 * @Date 2019/5/23
 * @describe ::
 * @Version ::
 */
public class Test02UserViewModel extends BaseObservable {

    public UserBean obUserBean = new UserBean();

    public String myString ="默认的初始String";


    public Test02UserViewModel(){

    }

    @Bindable
    public UserBean getObUserBean(){
        //System.out.println("执行了   getObUserBean 的方法  username ==" +obUserBean.getUserName());
        return obUserBean;
    }

    public void setObUserBean(UserBean userBean){
        System.out.println("执行了   setobUserBean 的方法  username ==" +userBean.getUserName());
        this.obUserBean = userBean;
        notifyPropertyChanged(BR.obUserBean);
    }

    @Bindable
    public String getMyString(){
        return myString;
    }

    public void setMyString(String st){
        System.out.println("新的st的数据是 ===" +st);
        this.myString = st;
        notifyPropertyChanged(BR.myString);
    }



    private OkHttpClient client;

    public void userLogin(final View view) {
        System.out.println("UserName ==" + obUserBean.getUserName() + "     password ===" + obUserBean.getPassword());

/**
        UserBean userBean = new UserBean();

        userBean.setUserName("李四");
        userBean.setPassword("赵阿姨的密码");

        this.setObUserBean(userBean);
*/


        RequestBody requestBody = new FormBody.Builder()
                .add("username", "admin")
                .add("password", "123")
                .build();
        Request request = new Request.Builder()
                .url(Contants.USER_LOGIN)
                .post(requestBody)
                .build();
        client = new OkHttpClient();
        Call call = client.newCall(request);
        call.enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                System.out.println("失败");
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {

                System.out.println("成功  ===" + response.toString());

                Looper.prepare();
                Toast.makeText(view.getContext(),"获取数据成功",Toast.LENGTH_SHORT).show();
                //setMyString(obUserBean.getUserName());
                //iTest02UserViewModelListener.onUserBeanChanged(userBean);

                Looper.loop();
            }
        });
    }


    public void onUserNameChanged(Editable s){
        System.out.println("触发了  password 的点击事件 " + s.toString());
    }

    public void onUserPasswordChanged(Editable s){
        System.out.println("触发了  password 的点击事件 " + s.toString());
    }

}
