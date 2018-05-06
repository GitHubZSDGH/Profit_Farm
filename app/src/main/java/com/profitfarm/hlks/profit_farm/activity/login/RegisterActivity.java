package com.profitfarm.hlks.profit_farm.activity.login;

import android.content.Intent;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.profitfarm.hlks.profit_farm.R;
import com.profitfarm.hlks.profit_farm.base.BaseActivity;

public class RegisterActivity extends BaseActivity implements View.OnClickListener {

    private ImageView mGoBackW;
    private TextView mTitleW;
    /**
     * 请出入手机号
     */
    private EditText mRegisterPhoneEt;
    /**
     * 手机号已注册
     */
    private TextView mPhoneCode;
    private EditText mRegisterCodeEt;
    /**
     * 获取验证码
     */
    private TextView mPwdVerificationCode;
    /**
     * 请输入8-16位字符
     */
    private EditText mRegisterNewpwdEt;
    /**
     * 请确认密码
     */
    private EditText mRegisterPasswordEt;
    /**
     * 注册
     */
    private TextView mRegisterLgBtn;
    /**
     * 已有账号，去登录
     */
    private TextView mLoginRegisterBtn;
    /**
     * 《华联注册协议》
     */
    private TextView mZhucexieyi;
    /**
     * 与 《隐私政策》
     */
    private TextView mYinsizhengce;

    @Override
    public int getLayoutId() {
        return R.layout.activity_register;
    }

    @Override
    public void initView() {

        mGoBackW = (ImageView) findViewById(R.id.go_back_w);
        mGoBackW.setOnClickListener(this);
        mTitleW = (TextView) findViewById(R.id.title_w);
        mRegisterPhoneEt = (EditText) findViewById(R.id.register_phone_et);
        mPhoneCode = (TextView) findViewById(R.id.phone_code);
        mPhoneCode.setOnClickListener(this);
        mRegisterCodeEt = (EditText) findViewById(R.id.register_code_et);
        mPwdVerificationCode = (TextView) findViewById(R.id.pwd_verification_code);
        mPwdVerificationCode.setOnClickListener(this);
        mRegisterNewpwdEt = (EditText) findViewById(R.id.register_newpwd_et);
        mRegisterPasswordEt = (EditText) findViewById(R.id.register_password_et);
        mRegisterLgBtn = (TextView) findViewById(R.id.register_lg_btn);
        mRegisterLgBtn.setOnClickListener(this);
        mLoginRegisterBtn = (TextView) findViewById(R.id.login_register_btn);
        mLoginRegisterBtn.setOnClickListener(this);
        mZhucexieyi = (TextView) findViewById(R.id.zhucexieyi);
        mZhucexieyi.setOnClickListener(this);
        mYinsizhengce = (TextView) findViewById(R.id.yinsizhengce);
        mYinsizhengce.setOnClickListener(this);
        mTitleW.setText("注册");
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
            case R.id.go_back_w:
                finish();
                break;
            case R.id.phone_code:
                break;
            case R.id.pwd_verification_code:
                break;
            case R.id.register_lg_btn:
                break;
            case R.id.login_register_btn:
                startActivity(new Intent(RegisterActivity.this,LoginActivity.class));
                break;
            case R.id.zhucexieyi:
                break;
            case R.id.yinsizhengce:
                break;
        }
    }
}
