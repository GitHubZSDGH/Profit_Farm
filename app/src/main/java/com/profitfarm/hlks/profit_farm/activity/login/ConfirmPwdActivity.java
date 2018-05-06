package com.profitfarm.hlks.profit_farm.activity.login;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.profitfarm.hlks.profit_farm.R;
import com.profitfarm.hlks.profit_farm.base.BaseActivity;

public class ConfirmPwdActivity extends BaseActivity implements View.OnClickListener {

    private ImageView mGoBackW;
    private TextView mTitleW;
    /**
     * 请输入8-16位字符
     */
    private EditText mConfirmNewpwdEt;
    /**
     * 请确认密码
     */
    private EditText mConfirmPasswordEt;
    /**
     * 确认
     */
    private TextView mConfirmLgBtn;

    @Override
    public int getLayoutId() {
        return R.layout.activity_confirm_pwd;
    }

    @Override
    public void initView() {

        mGoBackW = (ImageView) findViewById(R.id.go_back_w);
        mGoBackW.setOnClickListener(this);
        mTitleW = (TextView) findViewById(R.id.title_w);
        mConfirmNewpwdEt = (EditText) findViewById(R.id.confirm_newpwd_et);
        mConfirmPasswordEt = (EditText) findViewById(R.id.confirm_password_et);
        mConfirmLgBtn = (TextView) findViewById(R.id.confirm_lg_btn);
        mConfirmLgBtn.setOnClickListener(this);
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
            case R.id.confirm_lg_btn:

                break;
        }
    }
}
