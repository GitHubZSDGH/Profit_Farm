package com.profitfarm.hlks.profit_farm;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.profitfarm.hlks.profit_farm.base.BaseActivity;
import com.profitfarm.hlks.profit_farm.config.FragmentBuilder;
import com.profitfarm.hlks.profit_farm.fragment.IntroduceFragment;
import com.profitfarm.hlks.profit_farm.fragment.MarketFragment;
import com.profitfarm.hlks.profit_farm.fragment.MineFragment;
import com.profitfarm.hlks.profit_farm.fragment.PastureFragment;

import static com.profitfarm.hlks.profit_farm.App.baseActivity;

public class MainActivity extends BaseActivity implements View.OnClickListener {


    /**
     * 牧场
     */
    private RadioButton mHomeButton1;
    /**
     * 介绍
     */
    private RadioButton mHomeButton2;
    /**
     * 市场
     */
    private RadioButton mHomeButton3;
    /**
     * 我的
     */
    private RadioButton mHomeButton4;
    private RadioGroup mHomePage;
    String selector_fragment;
    private MainActivity mainActivity;
    @Override
    public int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    public void initView() {
        //首页默认fragment
        mainActivity = this;
        FragmentBuilder.getInstance(this)
                .start(PastureFragment.class)
                .add(R.id.main_home)
                .commit();
        mHomeButton1 = (RadioButton) findViewById(R.id.home_button1);
        mHomeButton1.setOnClickListener(this);
        mHomeButton2 = (RadioButton) findViewById(R.id.home_button2);
        mHomeButton2.setOnClickListener(this);
        mHomeButton3 = (RadioButton) findViewById(R.id.home_button3);
        mHomeButton3.setOnClickListener(this);
        mHomeButton4 = (RadioButton) findViewById(R.id.home_button4);
        mHomeButton4.setOnClickListener(this);
        mHomePage = (RadioGroup) findViewById(R.id.home_page);

    }

    @Override
    public void loadData() {
        Intent intert=  this.getIntent();
        if(intert != null){
            selector_fragment = intert.getStringExtra("getMessage");
            if (selector_fragment!=null&&selector_fragment.equals("1")){
                mHomePage.check(R.id.home_button3);
            }else {
                mHomePage.check(R.id.home_button1);
            }
        }
    }

    @Override
    public void setListener() {

    }

    @Override
    protected void onResume() {
        int id = getIntent().getIntExtra("fragment",0);
        if (id==1){
            mHomePage.check(R.id.home_button4);
        }
        super.onResume();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            default:
                break;
            case R.id.home_button1:
                FragmentBuilder.getInstance(baseActivity)
                        .start(PastureFragment.class)
                        .add(R.id.main_home)
                        .commit();
                break;
            case R.id.home_button2:
                FragmentBuilder.getInstance(baseActivity)
                        .start(IntroduceFragment.class)
                        .add(R.id.main_home)
                        .commit();
                break;
            case R.id.home_button3:
                FragmentBuilder.getInstance(baseActivity)
                        .start(MarketFragment.class)
                        .add(R.id.main_home)
                        .commit();
                break;
            case R.id.home_button4:
                FragmentBuilder.getInstance(baseActivity)
                        .start(MineFragment.class)
                        .add(R.id.main_home)
                        .commit();
                break;
        }
    }
}
