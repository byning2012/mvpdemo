package com.panda.mvpbasedemo.login;


import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.panda.mvpbasedemo.R;
import com.panda.mvpbasedemo.mvp.MVPBaseActivity;


/**
 * MVPPlugin
 * 邮箱 784787081@qq.com
 */

public class LoginActivity extends MVPBaseActivity<LoginContract.View, LoginPresenter> implements LoginContract.View {

    private EditText editText1;
    private EditText editText2;

    @Override
    protected int getLayoutView() {
        return R.layout.activity_login2;
    }

    @Override
    protected void initEvent() {
        editText1 = (EditText) findViewById(R.id.editText);
        editText2 = (EditText) findViewById(R.id.editText2);
        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mPresenter.login(editText1.getText().toString(), editText2.getText().toString());
            }
        });

    }

    @Override
    public void loginSuccess(String user) {
        Log.e("TAG", user);
    }

    @Override
    public void loginFailed(String message) {
        Log.e("TAG", message);
    }
}
