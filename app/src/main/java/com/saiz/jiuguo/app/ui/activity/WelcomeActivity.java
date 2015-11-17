package com.saiz.jiuguo.app.ui.activity;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.saiz.jiuguo.R;
import com.saiz.jiuguo.app.adapter.WelcomeViewpagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class WelcomeActivity extends AppCompatActivity {
    private ViewPager viewPager_welcome;
    private List welcome_pics;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        viewPager_welcome= (ViewPager) findViewById(R.id.welcome_viewpager);
        welcome_pics=new ArrayList();
        welcome_pics.add(R.drawable.start_page1);
        welcome_pics.add(R.drawable.start_page2);
        welcome_pics.add(R.drawable.start_page3);
        welcome_pics.add(R.drawable.start_page4);
        welcome_pics.add(R.drawable.start_page5);
        viewPager_welcome.setAdapter(new WelcomeViewpagerAdapter(this,welcome_pics));
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        finish();
    }

    @Override
    protected void onStop() {
        super.onStop();
        finish();
    }
}
