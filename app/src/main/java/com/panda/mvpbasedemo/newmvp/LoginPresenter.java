package com.panda.mvpbasedemo.newmvp;

/**
 * author : 宁立森
 * e-mail : byning2012@163.com
 * time   : 2017/10/10
 * desc   :
 * version: 1.0
 */
public interface LoginPresenter {
    void validateCredentials(String name, String password);

    void onDestroy();
}
