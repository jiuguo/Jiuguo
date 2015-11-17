package com.saiz.jiuguo.app.ui.activity;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.saiz.jiuguo.app.fragment.ChannelFragment;
import com.saiz.jiuguo.app.fragment.DiscoverFragment;
import com.saiz.jiuguo.app.fragment.FollowFragment;
import com.saiz.jiuguo.app.fragment.HomeFragment;
import com.saiz.jiuguo.app.fragment.UesrFragment;
import com.saiz.jiuguo.R;

public class PageActivity extends AppCompatActivity {
    private RadioGroup radioGroup;
    FragmentManager manager;
    FragmentTransaction transaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page);
        //设置全屏
        //getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        radioGroup = (RadioGroup) findViewById(R.id.page_radioGroup);
        manager = getSupportFragmentManager();

        initRadioGroup();
    }

    /**
     * 初始化RadioGroup监听
     * 初始化Fragment
     */
    private void initRadioGroup() {
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case R.id.page_radioButton_home:
                        showFragment(new HomeFragment(), "home");
                        break;
                    case R.id.page_radioButton_channel:
                        showFragment(new ChannelFragment(), "channel");
                        break;
                    case R.id.page_radioButton_follow:
                        showFragment(new FollowFragment(), "follow");
                        break;
                    case R.id.page_radioButton_discover:
                        showFragment(new DiscoverFragment(), "discover");
                        break;
                    case R.id.page_radioButton_user:
                        showFragment(new UesrFragment(), "user");
                        break;
                }
            }
        });
        RadioButton button=(RadioButton)findViewById(R.id.page_radioButton_home);
        button.setChecked(true);
    }

    private void showFragment(Fragment fragment, String tag) {
        transaction = manager.beginTransaction();
        hideFragmentAll();
        Fragment fragmentTemp = manager.findFragmentByTag(tag);
        if (fragmentTemp != null) {
            transaction.show(fragmentTemp);
        } else {
            transaction.add(R.id.page_frameLayout, fragment, tag);
        }
        transaction.commit();
    }

    /**
     * 隐藏全部Fragment
     */
    private void hideFragmentAll() {
        if (manager.findFragmentByTag("home") != null) {
            transaction.hide(manager.findFragmentByTag("home"));
        }
        if (manager.findFragmentByTag("channel") != null) {
            transaction.hide(manager.findFragmentByTag("channel"));
        }
        if (manager.findFragmentByTag("follow") != null) {
            transaction.hide(manager.findFragmentByTag("follow"));
        }
        if (manager.findFragmentByTag("user") != null) {
            transaction.hide(manager.findFragmentByTag("user"));
        }
        if (manager.findFragmentByTag("discover") != null) {
            transaction.hide(manager.findFragmentByTag("discover"));
        }
    }
}
