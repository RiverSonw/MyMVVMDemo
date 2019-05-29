package com.eddardgao.mymvvmdemo01.viewModel;

import com.eddardgao.mymvvmdemo01.bean.UserBean;

/**
 * @Author EddardGao
 * @Email 754231090@qq.com
 * @Date 2019/5/21
 * @describe ::
 * @Version ::
 */
public interface IUserViewModel {

    public boolean isloginthreadOP = true;

    public boolean islogoutthreadOP = true;

    public boolean isgetinfothreadOP = true;

    public void UserLogin(String UserId, String password);

    public boolean UserLogout();

    public UserBean GetUserInfo();


}
