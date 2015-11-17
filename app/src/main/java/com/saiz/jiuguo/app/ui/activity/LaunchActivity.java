package com.saiz.jiuguo.app.ui.activity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import com.alibaba.fastjson.JSON;
import com.saiz.jiuguo.R;
import com.saiz.jiuguo.app.bean.LaunchImageBean;
import com.saiz.jiuguo.app.url.JiuguoUrl;

import org.xutils.common.Callback;
import org.xutils.http.RequestParams;
import org.xutils.image.ImageOptions;
import org.xutils.x;

public class LaunchActivity extends AppCompatActivity {
    private ImageView imageView_loading;
    private boolean isFirst;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launch);
        RequestParams params = new RequestParams(JiuguoUrl.getLaunchImg);


        imageView_loading= (ImageView) findViewById(R.id.start_loading_image);
        imageView_loading.setOnClickListener(new View.OnClickListener() {
            /**
             * 图片点击进入
             * 判断是不是第一次登陆
             * @param v
             */
            @Override
            public void onClick(View v) {
                SharedPreferences preferences = getSharedPreferences("User", MODE_PRIVATE);
                isFirst = preferences.getBoolean("isFirst", true);
                if (isFirst) {
                    SharedPreferences.Editor edit = preferences.edit();
                    edit.putBoolean("isFirst", false);
                    Intent intent = new Intent(LaunchActivity.this,WelcomeActivity.class);
                    startActivity(intent);
                    finish();

                } else {
                    Intent intent = new Intent(LaunchActivity.this, PageActivity.class);
                    startActivity(intent);
                    finish();
                }
            }
        });
        x.http().get(params, new Callback.CommonCallback<String>() {
            @Override
            public void onSuccess(String result) {
                LaunchImageBean launchImageBean = JSON.parseObject(result, LaunchImageBean.class);
                ImageOptions options = new ImageOptions.Builder()
                        // 加载中或错误图片的ScaleType
                        //.setPlaceholderScaleType(ImageView.ScaleType.MATRIX)
                        // 默认自动适应大小
                        // .setSize(...)
                        .setIgnoreGif(false)
                        .setImageScaleType(ImageView.ScaleType.MATRIX).build();
                x.image().bind(imageView_loading, launchImageBean.getImg(), options);
            }

            @Override
            public void onError(Throwable ex, boolean isOnCallback) {
                ex.printStackTrace();
            }

            @Override
            public void onCancelled(CancelledException cex) {
                cex.printStackTrace();
            }

            @Override
            public void onFinished() {

            }
        });





    }


}
