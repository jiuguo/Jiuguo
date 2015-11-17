package com.saiz.jiuguo.app.ui.application;

import android.app.Application;

import org.xutils.x;

/**
 * Created by Administrator on 2015/11/16.
 */
public class JiuguoApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        x.Ext.init(this);
    }
}
