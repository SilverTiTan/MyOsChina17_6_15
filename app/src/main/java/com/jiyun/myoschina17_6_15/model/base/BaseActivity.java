package com.jiyun.myoschina17_6_15.model.base;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

import com.jiyun.myoschina17_6_15.global.MyApp;


public abstract class BaseActivity extends FragmentActivity {
    @Override
    protected void onCreate(Bundle arg0) {
        super.onCreate(arg0);
        setContentView(getLayout());
        MyApp.mBaseActivity = this;
        initId();
        onClick();
        initData();
    }

    protected abstract int getLayout();

    protected abstract void initId();

    protected abstract void initData();


    protected abstract void onClick();


    @Override
    protected void onResume() {
        super.onResume();
        MyApp.mBaseActivity = this;
    }
}
