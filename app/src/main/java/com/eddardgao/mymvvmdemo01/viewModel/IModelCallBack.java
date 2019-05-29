package com.eddardgao.mymvvmdemo01.viewModel;

import java.io.IOException;

/**
 * @Author EddardGao
 * @Email 754231090@qq.com
 * @Date 2019/5/22
 * @describe ::
 * @Version ::
 */
public interface IModelCallBack  {

    /**
     * 失败了，返回失败的原因，描述
     * @param e
     */
    void onFailure(IOException e);

    /**
     * 执行成功，返回需要的成员信息
     * @param object
     */
    void onSuccess(Object object);
}
