package com.panda.mvpbasedemo.newmvp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.ProgressBar;

import com.panda.mvpbasedemo.MainActivity;
import com.panda.mvpbasedemo.R;

public class LoginActivity extends AppCompatActivity implements LoginView, View.OnClickListener {

    private ProgressBar progressBar;
    private EditText username;
    private EditText password;
    private LoginPresenter loginPresenter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login3);

        loginPresenter = new LoginPresenterImpl(this);
    }

    @Override
    public void onClick(View view) {
        loginPresenter.validateCredentials("", "");
    }

    @Override
    public void showProgress() {

    }

    @Override
    public void hideProgress() {

    }

    @Override
    public void setuUserNameError() {

    }

    @Override
    public void setPasswordError() {

    }

    @Override
    public void navigateToHome() {
        startActivity(new Intent(this, MainActivity.class));
        finish();
    }
}
