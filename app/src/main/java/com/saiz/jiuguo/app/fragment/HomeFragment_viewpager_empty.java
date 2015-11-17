package com.saiz.jiuguo.app.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.saiz.jiuguo.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment_viewpager_empty extends Fragment {
    private TextView textView;

    public HomeFragment_viewpager_empty() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home_fragment_viewpager_empty, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        textView= (TextView) view.findViewById(R.id.home_page_viewpager_emptyTitle);
        Bundle arguments = getArguments();
        textView.setText(arguments.getString("name"));

    }
}
