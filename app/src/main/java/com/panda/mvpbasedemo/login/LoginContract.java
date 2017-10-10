package com.panda.mvpbasedemo.login;

import com.panda.mvpbasedemo.mvp.BasePresenter;
import com.panda.mvpbasedemo.mvp.BaseView;

/**
 * MVPPlugin
 * 邮箱 784787081@qq.com
 */

public class LoginContract {
    interface View extends BaseView {
        //在view层回调，根据presenter逻辑调用
        void loginSuccess(String user);

        void loginFailed(String message);
    }

    interface Presenter extends BasePresenter<View> {
        //在view层调用，在presenter中实现
        void login(String username, String password);
    }
}
