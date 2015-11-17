package com.saiz.jiuguo.app.adapter;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.saiz.jiuguo.app.bean.GameTypeListBean;
import com.saiz.jiuguo.app.fragment.HomeFragmemt_viewpager_dota;
import com.saiz.jiuguo.app.fragment.HomeFragment_viewpager_empty;
import com.saiz.jiuguo.app.fragment.HomeFragment_viewpager_fragment_home;

import java.util.List;

/**
 * Created by Administrator on 2015/11/16.
 */
public class HomeViewpagerAdapter extends FragmentPagerAdapter {
    private List<GameTypeListBean> gameTypes;
    public HomeViewpagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {

        Fragment fragment;
        if (position==0){
            fragment=new HomeFragment_viewpager_fragment_home();
        }else if (position==1){
            fragment=new HomeFragmemt_viewpager_dota();
        }else {
            fragment=new HomeFragment_viewpager_empty();
            Bundle bundle=new Bundle();
           bundle.putString("name",gameTypes.get(position-1).getName());
            fragment.setArguments(bundle);
        }


        return fragment;
    }

    @Override
    public int getCount() {
        System.out.println("gameTypes.size():"+gameTypes.size());
        return gameTypes.size()+1;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        int tempPosition=position-1;
        String name;
        if (tempPosition==-1){
            name="推荐";
        }else{
            name= gameTypes.get(tempPosition).getName();
        }

        return name;
    }
    public void addList(List<GameTypeListBean> gameTypes){
        this.gameTypes=gameTypes;
    }

}
