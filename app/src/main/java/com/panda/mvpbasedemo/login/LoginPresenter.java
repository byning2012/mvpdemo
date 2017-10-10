package com.panda.mvpbasedemo.login;

import android.os.Handler;

import com.panda.mvpbasedemo.mvp.BasePresenterImpl;


/**
 * MVPPlugin
 * 邮箱 784787081@qq.com
 */

public class LoginPresenter extends BasePresenterImpl<LoginContract.View> implements LoginContract.Presenter {

    @Override
    public void login(final String username, final String password) {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                boolean error = false;
                if (username.equals("")) {
                    mView.loginFailed("登录失败啦");
                    error = true;
                    return;
                }
                if (password.equals("密码") && username.equals("登录")) {
                    mView.loginSuccess("登录成功");
                }
            }
        }, 2000);
    }
}
