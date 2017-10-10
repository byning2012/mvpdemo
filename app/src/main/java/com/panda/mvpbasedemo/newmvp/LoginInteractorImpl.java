package com.panda.mvpbasedemo.newmvp;

import android.os.Handler;

/**
 * author : 宁立森
 * e-mail : byning2012@163.com
 * time   : 2017/10/10
 * desc   :
 * version: 1.0
 */
public class LoginInteractorImpl implements LoginInteror {
    @Override
    public void login(final String username, final String password, final OnLoginFinishedListener listener) {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                boolean error = false;
                if (username.equals("")) {
                    listener.onUsernameError();
                    error = true;
                    return;
                }
                if (password.equals("")) {
                    listener.onPasswordError();
                    error = true;
                }
                if (!error) {
                    listener.onSuccess();
                }
            }
        }, 2000);
    }
}
