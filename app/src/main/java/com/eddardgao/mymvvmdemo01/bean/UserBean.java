package com.eddardgao.mymvvmdemo01.bean;

import java.io.Serializable;

/**
 * @Author EddardGao
 * @Email 754231090@qq.com
 * @Date 2019/5/21
 * @describe ::
 * @Version ::
 */
public class UserBean implements Serializable {

    private static final long serialVersionUID = -4576840045338985104L;


    private String userName;
    private String password;
    private String sex;
    private int age;

    public UserBean(){

    }


    public UserBean(String userName,String password,String sex,int age){
        this.userName = userName;
        this.password = password;
        this.sex = sex;
        this.age = age;

    }


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }




}
