package com.profitfarm.hlks.profit_farm.activity.login;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.profitfarm.hlks.profit_farm.R;
import com.profitfarm.hlks.profit_farm.base.BaseActivity;

public class RetrievePasswordActivity extends BaseActivity implements View.OnClickListener {


    private ImageView mGoBackW;
    private TextView mTitleW;
    private EditText mPwdPhoneEt;
    private EditText mPwdPasswordEt;
    /**
     * 获取验证码
     */
    private TextView mPwdVerificationCode;
    /**
     * 下一步
     */
    private TextView mPwdLgBtn;

    @Override
    public int getLayoutId() {
        return R.layout.activity_retrieve_password;
    }

    @Override
    public void initView() {

        mGoBackW = (ImageView) findViewById(R.id.go_back_w);
        mGoBackW.setOnClickListener(this);
        mTitleW = (TextView) findViewById(R.id.title_w);
        mPwdPhoneEt = (EditText) findViewById(R.id.pwd_phone_et);
        mPwdPasswordEt = (EditText) findViewById(R.id.pwd_password_et);
        mPwdVerificationCode = (TextView) findViewById(R.id.pwd_verification_code);
        mPwdVerificationCode.setOnClickListener(this);
        mPwdLgBtn = (TextView) findViewById(R.id.pwd_lg_btn);
        mPwdLgBtn.setOnClickListener(this);
        mTitleW.setText("找回密码");
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
            case R.id.pwd_verification_code:
                break;
            case R.id.pwd_lg_btn:
                break;
        }
    }
}
