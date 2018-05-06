package com.profitfarm.hlks.profit_farm.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.profitfarm.hlks.profit_farm.R;
import com.profitfarm.hlks.profit_farm.base.BaseFragment;

/**
 * Created by lenovo on 2018/4/26.
 * 牧场
 */

public class PastureFragment extends BaseFragment implements View.OnClickListener {

    private View view;
    private ImageView mGoBack;
    private TextView mTitleW;
    private ImageView mRightIc;
    private ImageView mChangjingFu;
    /**
     * 0只
     */
    private TextView mHomeSheepNum;
    /**
     * 800元
     */
    private TextView mHomeMoney;
    private LinearLayout mZzzz;
    private ImageView mHomeQianggouIv;
    private ImageView mHomeSheepIv;

    @Override
    public int getLayoutId() {
        return R.layout.fragmen_pasture;
    }

    @Override
    public void initView(View view) {

        mGoBack = (ImageView) view.findViewById(R.id.go_back);
        mGoBack.setOnClickListener(this);
        mTitleW = (TextView) view.findViewById(R.id.title_w);
        mRightIc = (ImageView) view.findViewById(R.id.right_ic);
        mChangjingFu = (ImageView) view.findViewById(R.id.changjing_fu);
        mHomeSheepNum = (TextView) view.findViewById(R.id.home_sheep_num);
        mHomeMoney = (TextView) view.findViewById(R.id.home_money);
        mZzzz = (LinearLayout) view.findViewById(R.id.zzzz);
        mHomeQianggouIv = (ImageView) view.findViewById(R.id.home_qianggou_iv);
        mHomeQianggouIv.setOnClickListener(this);
        mHomeSheepIv = (ImageView) view.findViewById(R.id.home_sheep_iv);
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

            case R.id.go_back:
                break;
            case R.id.home_qianggou_iv:
                break;
        }
    }


}
