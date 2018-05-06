package com.profitfarm.hlks.profit_farm;

import android.app.Application;
import android.content.Context;
import android.support.annotation.NonNull;
import android.util.SparseArray;

import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.profitfarm.hlks.profit_farm.base.BaseActivity;
import com.profitfarm.hlks.profit_farm.base.BaseFragment;
import com.profitfarm.hlks.profit_farm.utils.SharedPreferencesUtils;
import com.profitfarm.hlks.profit_farm.utils.ToastUtils;
import com.scwang.smartrefresh.layout.api.DefaultRefreshFooterCreater;
import com.scwang.smartrefresh.layout.api.DefaultRefreshHeaderCreater;
import com.scwang.smartrefresh.layout.api.RefreshFooter;
import com.scwang.smartrefresh.layout.api.RefreshHeader;
import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.constant.SpinnerStyle;
import com.scwang.smartrefresh.layout.footer.ClassicsFooter;
import com.scwang.smartrefresh.layout.header.ClassicsHeader;

import java.util.Map;




public class App extends Application {
    /**
     * 管理Fragment的集合
     */
    public static SparseArray<BaseFragment> lastSparse;
    public static BaseActivity baseActivity;
    public static BaseFragment lastFragment;
//    public static MyOkHttp myOkHttp;
    public static Context mContext;


    @Override
    public void onCreate() {
        super.onCreate();
//        MyOkHttp.context = this;
//        SharedPreferencesUtils.init(this);
//        HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
//        logging.setLevel(HttpLoggingInterceptor.Level.BODY);
//        myOkHttp = new MyOkHttp(new OkHttpClient.Builder().addInterceptor(logging)
//
//                .build());
        lastSparse = new SparseArray<>();
        mContext = this;
        ToastUtils.init(this);
        initRefrush();

    }

//    private void addParams(Request request, String method, Request.Builder requestBuilder, Map<String, String> params) {
//
//    }

    public static Context getmContext() {
        return mContext;
    }

    public static void setmContext(Context mContext) {
        App.mContext = mContext;
    }

    @Override
    public void onLowMemory() {
        super.onLowMemory();
    }
    private void initRefrush() {
        /**
         * 配置全局Header
         */
        SmartRefreshLayout.setDefaultRefreshHeaderCreater(new DefaultRefreshHeaderCreater() {
            @NonNull
            @Override
            public RefreshHeader createRefreshHeader(Context context, RefreshLayout layout) {
                layout.setEnableHeaderTranslationContent(false);
                ClassicsHeader header = new ClassicsHeader(context);
                header.setBackgroundResource(android.R.color.white);
                header.setSpinnerStyle(SpinnerStyle.Scale);//设置为拉伸模式
                return header;
            }
        });
//        /**
//         * 配置默认的footer
//         */
        SmartRefreshLayout.setDefaultRefreshFooterCreater(new DefaultRefreshFooterCreater() {
            @NonNull
            @Override
            public RefreshFooter createRefreshFooter(Context context, RefreshLayout layout) {
                layout.setEnableLoadmoreWhenContentNotFull(false);
                ClassicsFooter footer = new ClassicsFooter(context);
                footer.setBackgroundResource(android.R.color.white);
                footer.setSpinnerStyle(SpinnerStyle.Scale);//设置为拉伸模式
                return footer;//指定为经典Footer，默认是 BallPulseFooter
            }
        });
    }
}
