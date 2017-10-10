package com.panda.mvpbasedemo.newmvp;

/**
 * author : 宁立森
 * e-mail : byning2012@163.com
 * time   : 2017/10/10
 * desc   :另一个mvp写法
 * version: 1.0
 */
public interface LoginView {

    void showProgress();

    void hideProgress();

    void setuUserNameError();

    void setPasswordError();

    void navigateToHome();


}
