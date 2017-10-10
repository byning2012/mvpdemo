package com.panda.mvpbasedemo.newmvp;

/**
 * author : 宁立森
 * e-mail : byning2012@163.com
 * time   : 2017/10/10
 * desc   :
 * version: 1.0
 */
public class LoginPresenterImpl implements LoginPresenter, LoginInteror.OnLoginFinishedListener {


    private LoginView mLoginView;
    private LoginInteror mLoginInteror;

    public LoginPresenterImpl(LoginView mLoginView) {
        this.mLoginView = mLoginView;
        this.mLoginInteror = new LoginInteractorImpl();
    }

    @Override
    public void validateCredentials(String name, String password) {
        if (mLoginView != null) {
            mLoginView.showProgress();
        }
    }

    @Override
    public void onDestroy() {
        mLoginView = null;
    }

    @Override
    public void onUsernameError() {
        if (mLoginView != null) {
            mLoginView.setuUserNameError();
            mLoginView.hideProgress();
        }
    }

    @Override
    public void onPasswordError() {
        if (mLoginView != null) {
            mLoginView.setPasswordError();
            mLoginView.hideProgress();
        }
    }

    @Override
    public void onSuccess() {
        if (mLoginView != null) {
            mLoginView.navigateToHome();
        }
    }

}
