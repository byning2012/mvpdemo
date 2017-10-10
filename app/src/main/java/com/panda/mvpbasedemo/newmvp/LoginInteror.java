package com.panda.mvpbasedemo.newmvp;

/**
 * author : 宁立森
 * e-mail : byning2012@163.com
 * time   : 2017/10/10
 * desc   :
 * version: 1.0
 */
public interface LoginInteror {
    interface OnLoginFinishedListener {
        void onUsernameError();

        void onPasswordError();

        void onSuccess();
    }

    void login(String username, String password, OnLoginFinishedListener listener);
}
