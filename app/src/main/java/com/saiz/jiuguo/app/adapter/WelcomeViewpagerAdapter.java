package com.saiz.jiuguo.app.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.saiz.jiuguo.app.ui.activity.PageActivity;

import java.util.List;

/**
 * Created by Administrator on 2015/11/16.
 */
public class WelcomeViewpagerAdapter extends PagerAdapter {
    private Context context;
    private   List welcome_pics;

    public WelcomeViewpagerAdapter(Context context, List welcome_pics) {
        this.context = context;
        this.welcome_pics = welcome_pics;
    }




    @Override
    public int getCount() {
        return welcome_pics.size();
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view==object;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
       ImageView imageView = new ImageView(context);
        imageView.setImageResource((int) welcome_pics.get(position));

        imageView.setScaleType(ImageView.ScaleType.FIT_XY);

    if (position==4){
    imageView.setOnClickListener(new View.OnClickListener() {

        @Override
        public void onClick(View v) {
            Intent intent = new Intent(context, PageActivity.class);
            context.startActivity(intent);

        }
    });}

        container.addView(imageView);
        return imageView;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((View) object);
    }
}
