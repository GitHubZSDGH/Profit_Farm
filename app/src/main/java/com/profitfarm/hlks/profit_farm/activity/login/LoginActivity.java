package com.profitfarm.hlks.profit_farm.activity.login;

import android.content.Intent;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.profitfarm.hlks.profit_farm.R;
import com.profitfarm.hlks.profit_farm.base.BaseActivity;

public class LoginActivity extends BaseActivity implements View.OnClickListener {


    private ImageView mGoBackW;
    private TextView mTitleW;
    private EditText mLoginPhoneEt;
    private EditText mLoginPasswordEt;
    private ImageView mLoginColseIv;
    private ImageView mLoginYesIv;
    /**
     * 忘记密码？  dsadsadsa
     */
    private TextView mForgetPwdTv;
    /**
     * 登录
     */
    private TextView mLoginLgBtn;
    /**
     * 还没账号？去注册
     */
    private TextView mLoginRegisterBtn;

    @Override
    public int getLayoutId() {
        return R.layout.activity_login;
    }

    @Override
    public void initView() {

        mGoBackW = (ImageView) findViewById(R.id.go_back_w);
        mGoBackW.setOnClickListener(this);
        mTitleW = (TextView) findViewById(R.id.title_w);
        mLoginPhoneEt = (EditText) findViewById(R.id.login_phone_et);
        mLoginPasswordEt = (EditText) findViewById(R.id.login_password_et);
        mLoginColseIv = (ImageView) findViewById(R.id.login_colse_iv);
        mLoginYesIv = (ImageView) findViewById(R.id.login_yes_iv);
        mForgetPwdTv = (TextView) findViewById(R.id.forget_pwd_tv);
        mForgetPwdTv.setOnClickListener(this);
        mLoginLgBtn = (TextView) findViewById(R.id.login_lg_btn);
        mLoginLgBtn.setOnClickListener(this);
        mLoginRegisterBtn = (TextView) findViewById(R.id.login_register_btn);
        mLoginRegisterBtn.setOnClickListener(this);
        mTitleW.setText("登录");
    }

    @Override
    public void loadData() {

    }

    @Override
    public void setListener() {

    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            default:
                break;
            case R.id.forget_pwd_tv:
                startActivity(new Intent(LoginActivity.this,RetrievePasswordActivity.class));
                break;
            case R.id.go_back_w:
                finish();
                break;
            case R.id.login_lg_btn:

                break;
            case R.id.login_register_btn:
                startActivity(new Intent(LoginActivity.this,RegisterActivity.class));
                break;
        }
    }
}
