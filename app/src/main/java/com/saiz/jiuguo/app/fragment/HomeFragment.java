package com.saiz.jiuguo.app.fragment;


import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.alibaba.fastjson.JSON;
import com.saiz.jiuguo.R;
import com.saiz.jiuguo.app.adapter.HomeViewpagerAdapter;
import com.saiz.jiuguo.app.bean.GameTypeListBean;
import com.saiz.jiuguo.app.url.JiuguoUrl;

import org.xutils.common.Callback;
import org.xutils.http.RequestParams;
import org.xutils.x;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {
    private ViewPager home_viewPager;
    private List<GameTypeListBean> gameTypes;
    private HomeViewpagerAdapter adapter;
    private  TabLayout tab;
    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        tab = (TabLayout) view.findViewById(R.id.home_head_tab);
        home_viewPager= (ViewPager) view.findViewById(R.id.home_viewPager);
        adapter=new HomeViewpagerAdapter(getActivity().getSupportFragmentManager());
        initGameType();


    }

    /**
     * 获取分类信息
     */
    private void initGameType() {
        gameTypes=new ArrayList<GameTypeListBean>();
        //adapter.addList(gameTypes);

        RequestParams params = new RequestParams(JiuguoUrl.getGametype);
        System.out.println("获取分类开始");
        x.http().get(params, new Callback.CommonCallback<String>() {
            @Override
            public void onSuccess(String result) {
                gameTypes = JSON.parseArray(result, GameTypeListBean.class);
                adapter.addList(gameTypes);
                System.out.print(gameTypes);
                System.out.println("获取分类!!!!!!");

            }

            @Override
            public void onError(Throwable ex, boolean isOnCallback) {
                ex.printStackTrace();
                System.out.println("分类错误");
            }

            @Override
            public void onCancelled(CancelledException cex) {
                cex.printStackTrace();
                System.out.println("获取分类取消");
            }

            @Override
            public void onFinished() {
                System.out.println("获取分类完成");
                home_viewPager.setAdapter(adapter);
               // adapter.notifyDataSetChanged();
                tab.setupWithViewPager(home_viewPager);

            }
        });
        System.out.println("获取分类结束");

    }
}
