package com.saiz.jiuguo.app.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.saiz.jiuguo.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment_viewpager_fragment_home extends Fragment {

    private ViewPager viewPager;
    public HomeFragment_viewpager_fragment_home() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home_fragment_viewpager_fragment_home, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        viewPager= (ViewPager) view.findViewById(R.id.home_viewpager_fragment_viewpager);

    }
}
