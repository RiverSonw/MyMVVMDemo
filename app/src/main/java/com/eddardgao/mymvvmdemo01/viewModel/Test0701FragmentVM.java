package com.eddardgao.mymvvmdemo01.viewModel;

/**
 * @Author EddardGao
 * @Email 754231090@qq.com
 * @Date 2019/5/30
 * @describe ::
 * @Version ::
 */
public class Test0701FragmentVM {

    public String Test07Text;

    public Test0701FragmentVM (int a){
        Test07Text = "Test0701FragmentVM  ==" + a;

    }

    public void setTest07Text(int a){
        this.Test07Text = "Test0701FragmentVM  ==" + a;
    }

    public String getTest07Text(){
        return this.Test07Text;
    }


}
