package com.eddardgao.mymvvmdemo02.bean;

/**
 * @Author EddardGao
 * @Email 754231090@qq.com
 * @Date 2019/5/23
 * @describe ::
 * @Version ::
 */
public class UserBean {

    private String UserName;

    private String sex;

    private String age;

    public UserBean(){

    }

    public UserBean(String UserName,String sex,String age){
        this.UserName = UserName;
        this.sex = sex;
        this.age = age;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
