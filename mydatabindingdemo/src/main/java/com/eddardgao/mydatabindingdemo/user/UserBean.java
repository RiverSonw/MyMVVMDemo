package com.eddardgao.mydatabindingdemo.user;

/**
 * @Author EddardGao
 * @Email 754231090@qq.com
 * @Date 2019/5/17
 * @describe ::
 * @Version ::
 */


public class UserBean {
    private String UserName;

    private String UserSex;
    private int age;

    public  UserBean(String userName,String userSex,int age){
        this.UserName =  userName;
        this.UserSex = userSex;
        this.age = age;
    }



    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getUserSex() {
        return UserSex;
    }

    public void setUserSex(String userSex) {
        UserSex = userSex;
    }
}
