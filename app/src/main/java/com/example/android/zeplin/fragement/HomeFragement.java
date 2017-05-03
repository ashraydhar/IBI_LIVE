package com.example.android.zeplin.fragement;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.TextView;

import com.example.android.zeplin.AppConstants;
import com.example.android.zeplin.R;
import com.example.android.zeplin.modelDiscover.ModelDiscover;
import com.example.android.zeplin.recyclerViewAdapter.DiscoverAdapter;

import java.util.ArrayList;


/**
 * Created by SherDil on 29/4/17.
 */

public class HomeFragement extends Fragment {
    private TextView tvdiscover, tvmap, tvpost, tvrequest, tvnetwork, tvheader;
    private LinearLayout linear1, linear2, linear3, linear4, linear5;
    private ArrayList<ModelDiscover> modelDiscoverArrayList = new ArrayList<ModelDiscover>();
    private RecyclerView recyclerView;
    private int flag = 0;

    @Nullable
    @Override
    public View onCreateView(final LayoutInflater inflater, @Nullable final ViewGroup container, @Nullable final Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.fragement_home, container, false);
        final ViewPager vP = (ViewPager) view.findViewById(R.id.viewPager);
        vP.setOffscreenPageLimit(5);
        vP.setAdapter(new MyPagerAdapter(getChildFragmentManager()));

        tvdiscover = (TextView) view.findViewById(R.id.tv_discover);
        tvmap = (TextView) view.findViewById(R.id.tv_map);
        tvpost = (TextView) view.findViewById(R.id.tv_myPost);
        tvrequest = (TextView) view.findViewById(R.id.tv_request);
        tvnetwork = (TextView) view.findViewById(R.id.tv_myNetwork);
        tvheader = (TextView) view.findViewById(R.id.tv_header);
        linear1 = (LinearLayout) view.findViewById(R.id.linear1);
        linear2 = (LinearLayout) view.findViewById(R.id.linear2);
        linear3 = (LinearLayout) view.findViewById(R.id.linear3);
        linear4 = (LinearLayout) view.findViewById(R.id.linear4);
        linear5 = (LinearLayout) view.findViewById(R.id.linear5);

        linear1.setBackgroundResource(R.color.colorPrimary);
        linear2.setBackgroundResource(R.color.colorPrimaryDark);
        linear3.setBackgroundResource(R.color.colorPrimaryDark);
        linear4.setBackgroundResource(R.color.colorPrimaryDark);
        linear5.setBackgroundResource(R.color.colorPrimaryDark);
        tvnetwork.setVisibility(View.GONE);
        tvrequest.setVisibility(View.GONE);
        tvpost.setVisibility(View.GONE);
        tvmap.setVisibility(View.GONE);
        tvdiscover.setVisibility(View.VISIBLE);
        tvdiscover.setTextColor(Color.parseColor("#ffffff"));
        tvheader.setText("Discover");
        LinearLayout.LayoutParams loparams1 = (LinearLayout.LayoutParams) linear1.getLayoutParams();
        loparams1.weight = 4;
        linear1.setLayoutParams(loparams1);
        LinearLayout.LayoutParams loparams2 = (LinearLayout.LayoutParams) linear2.getLayoutParams();
        loparams2.weight = 1;
        linear2.setLayoutParams(loparams2);
        LinearLayout.LayoutParams loparams3 = (LinearLayout.LayoutParams) linear3.getLayoutParams();
        loparams3.weight = 1;
        linear3.setLayoutParams(loparams3);
        LinearLayout.LayoutParams loparams4 = (LinearLayout.LayoutParams) linear4.getLayoutParams();
        loparams4.weight = 1;
        linear4.setLayoutParams(loparams4);
        LinearLayout.LayoutParams loparams5 = (LinearLayout.LayoutParams) linear5.getLayoutParams();
        loparams5.weight = 1;
        linear5.setLayoutParams(loparams5);
        vP.setCurrentItem(0);

        linear1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(final View v) {
                linear1.setBackgroundResource(R.color.colorPrimary);
                linear2.setBackgroundResource(R.color.colorPrimaryDark);
                linear3.setBackgroundResource(R.color.colorPrimaryDark);
                linear4.setBackgroundResource(R.color.colorPrimaryDark);
                linear5.setBackgroundResource(R.color.colorPrimaryDark);
                tvnetwork.setVisibility(View.GONE);
                tvrequest.setVisibility(View.GONE);
                tvpost.setVisibility(View.GONE);
                tvmap.setVisibility(View.GONE);
                tvdiscover.setVisibility(View.VISIBLE);
                tvdiscover.setTextColor(Color.parseColor("#ffffff"));
                tvheader.setText("Discover");
                LinearLayout.LayoutParams loparams1 = (LinearLayout.LayoutParams) linear1.getLayoutParams();
                loparams1.weight = 4;
                linear1.setLayoutParams(loparams1);
                LinearLayout.LayoutParams loparams2 = (LinearLayout.LayoutParams) linear2.getLayoutParams();
                loparams2.weight = 1;
                linear2.setLayoutParams(loparams2);
                LinearLayout.LayoutParams loparams3 = (LinearLayout.LayoutParams) linear3.getLayoutParams();
                loparams3.weight = 1;
                linear3.setLayoutParams(loparams3);
                LinearLayout.LayoutParams loparams4 = (LinearLayout.LayoutParams) linear4.getLayoutParams();
                loparams4.weight = 1;
                linear4.setLayoutParams(loparams4);
                LinearLayout.LayoutParams loparams5 = (LinearLayout.LayoutParams) linear5.getLayoutParams();
                loparams5.weight = 1;
                linear5.setLayoutParams(loparams5);

                vP.setCurrentItem(0);
            }
        });

        linear2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(final View v) {
                linear2.setBackgroundResource(R.color.colorPrimary);
                linear1.setBackgroundResource(R.color.colorPrimaryDark);
                linear3.setBackgroundResource(R.color.colorPrimaryDark);
                linear4.setBackgroundResource(R.color.colorPrimaryDark);
                linear5.setBackgroundResource(R.color.colorPrimaryDark);
                tvnetwork.setVisibility(View.GONE);
                tvrequest.setVisibility(View.GONE);
                tvpost.setVisibility(View.GONE);
                tvdiscover.setVisibility(View.GONE);
                tvmap.setVisibility(View.VISIBLE);
                tvmap.setTextColor(Color.parseColor("#ffffff"));
                tvheader.setText("Map");
                LinearLayout.LayoutParams loparams1 = (LinearLayout.LayoutParams) linear1.getLayoutParams();
                loparams1.weight = 1;
                linear1.setLayoutParams(loparams1);
                LinearLayout.LayoutParams loparams2 = (LinearLayout.LayoutParams) linear2.getLayoutParams();
                loparams2.weight = 4;
                linear2.setLayoutParams(loparams2);
                LinearLayout.LayoutParams loparams3 = (LinearLayout.LayoutParams) linear3.getLayoutParams();
                loparams3.weight = 1;
                linear3.setLayoutParams(loparams3);
                LinearLayout.LayoutParams loparams4 = (LinearLayout.LayoutParams) linear4.getLayoutParams();
                loparams4.weight = 1;
                linear4.setLayoutParams(loparams4);
                LinearLayout.LayoutParams loparams5 = (LinearLayout.LayoutParams) linear5.getLayoutParams();
                loparams5.weight = 1;
                linear5.setLayoutParams(loparams5);
                vP.setCurrentItem(1);
            }
        });

        linear3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(final View v) {
                linear3.setBackgroundResource(R.color.colorPrimary);
                linear1.setBackgroundResource(R.color.colorPrimaryDark);
                linear2.setBackgroundResource(R.color.colorPrimaryDark);
                linear4.setBackgroundResource(R.color.colorPrimaryDark);
                linear5.setBackgroundResource(R.color.colorPrimaryDark);
                tvnetwork.setVisibility(View.GONE);
                tvrequest.setVisibility(View.GONE);
                tvpost.setVisibility(View.VISIBLE);
                tvdiscover.setVisibility(View.GONE);
                tvmap.setVisibility(View.GONE);
                tvpost.setTextColor(Color.parseColor("#ffffff"));
                tvheader.setText("My Posts");
                LinearLayout.LayoutParams loparams1 = (LinearLayout.LayoutParams) linear1.getLayoutParams();
                loparams1.weight = 1;
                linear1.setLayoutParams(loparams1);
                LinearLayout.LayoutParams loparams2 = (LinearLayout.LayoutParams) linear2.getLayoutParams();
                loparams2.weight = 1;
                linear2.setLayoutParams(loparams2);
                LinearLayout.LayoutParams loparams3 = (LinearLayout.LayoutParams) linear3.getLayoutParams();
                loparams3.weight = 4;
                linear3.setLayoutParams(loparams3);
                LinearLayout.LayoutParams loparams4 = (LinearLayout.LayoutParams) linear4.getLayoutParams();
                loparams4.weight = 1;
                linear4.setLayoutParams(loparams4);
                LinearLayout.LayoutParams loparams5 = (LinearLayout.LayoutParams) linear5.getLayoutParams();
                loparams5.weight = 1;
                linear5.setLayoutParams(loparams5);
                vP.setCurrentItem(2);

            }
        });

        linear4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(final View v) {
                linear4.setBackgroundResource(R.color.colorPrimary);
                linear1.setBackgroundResource(R.color.colorPrimaryDark);
                linear2.setBackgroundResource(R.color.colorPrimaryDark);
                linear3.setBackgroundResource(R.color.colorPrimaryDark);
                linear5.setBackgroundResource(R.color.colorPrimaryDark);
                tvnetwork.setVisibility(View.GONE);
                tvrequest.setVisibility(View.VISIBLE);
                tvpost.setVisibility(View.GONE);
                tvdiscover.setVisibility(View.GONE);
                tvmap.setVisibility(View.GONE);
                tvrequest.setTextColor(Color.parseColor("#ffffff"));
                tvheader.setText("New Requests");
                LinearLayout.LayoutParams loparams1 = (LinearLayout.LayoutParams) linear1.getLayoutParams();
                loparams1.weight = 1;
                linear1.setLayoutParams(loparams1);
                LinearLayout.LayoutParams loparams2 = (LinearLayout.LayoutParams) linear2.getLayoutParams();
                loparams2.weight = 1;
                linear2.setLayoutParams(loparams2);
                LinearLayout.LayoutParams loparams3 = (LinearLayout.LayoutParams) linear3.getLayoutParams();
                loparams3.weight = 1;
                linear3.setLayoutParams(loparams3);
                LinearLayout.LayoutParams loparams4 = (LinearLayout.LayoutParams) linear4.getLayoutParams();
                loparams4.weight = 4;
                linear4.setLayoutParams(loparams4);
                LinearLayout.LayoutParams loparams5 = (LinearLayout.LayoutParams) linear5.getLayoutParams();
                loparams5.weight = 1;
                linear5.setLayoutParams(loparams5);
                vP.setCurrentItem(3);

            }
        });

        linear5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(final View v) {
                linear5.setBackgroundResource(R.color.colorPrimary);
                linear1.setBackgroundResource(R.color.colorPrimaryDark);
                linear2.setBackgroundResource(R.color.colorPrimaryDark);
                linear3.setBackgroundResource(R.color.colorPrimaryDark);
                linear4.setBackgroundResource(R.color.colorPrimaryDark);
                tvnetwork.setVisibility(View.VISIBLE);
                tvrequest.setVisibility(View.GONE);
                tvpost.setVisibility(View.GONE);
                tvdiscover.setVisibility(View.GONE);
                tvmap.setVisibility(View.GONE);
                tvnetwork.setTextColor(Color.parseColor("#ffffff"));
                tvheader.setText("My Networks");
                LinearLayout.LayoutParams loparams1 = (LinearLayout.LayoutParams) linear1.getLayoutParams();
                loparams1.weight = 1;
                linear1.setLayoutParams(loparams1);
                LinearLayout.LayoutParams loparams2 = (LinearLayout.LayoutParams) linear2.getLayoutParams();
                loparams2.weight = 1;
                linear2.setLayoutParams(loparams2);
                LinearLayout.LayoutParams loparams3 = (LinearLayout.LayoutParams) linear3.getLayoutParams();
                loparams3.weight = 1;
                linear3.setLayoutParams(loparams3);
                LinearLayout.LayoutParams loparams4 = (LinearLayout.LayoutParams) linear4.getLayoutParams();
                loparams4.weight = 1;
                linear4.setLayoutParams(loparams4);
                LinearLayout.LayoutParams loparams5 = (LinearLayout.LayoutParams) linear5.getLayoutParams();
                loparams5.weight = 4;
                linear5.setLayoutParams(loparams5);
                vP.setCurrentItem(4);

            }
        });


        vP.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {

            @Override
            public void onPageScrolled(final int position, final float positionOffset, final int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(final int position) {
                if (position == 0) {
                    linear1.setBackgroundResource(R.color.colorPrimary);
                    linear2.setBackgroundResource(R.color.colorPrimaryDark);
                    linear3.setBackgroundResource(R.color.colorPrimaryDark);
                    linear4.setBackgroundResource(R.color.colorPrimaryDark);
                    linear5.setBackgroundResource(R.color.colorPrimaryDark);
                    tvnetwork.setVisibility(View.GONE);
                    tvrequest.setVisibility(View.GONE);
                    tvpost.setVisibility(View.GONE);
                    tvmap.setVisibility(View.GONE);
                    tvdiscover.setVisibility(View.VISIBLE);
                    tvdiscover.setTextColor(Color.parseColor("#ffffff"));
                    tvheader.setText("Discover");
                    LinearLayout.LayoutParams loparams1 = (LinearLayout.LayoutParams) linear1.getLayoutParams();
                    loparams1.weight = 4;
                    linear1.setLayoutParams(loparams1);
                    LinearLayout.LayoutParams loparams2 = (LinearLayout.LayoutParams) linear2.getLayoutParams();
                    loparams2.weight = 1;
                    linear2.setLayoutParams(loparams2);
                    LinearLayout.LayoutParams loparams3 = (LinearLayout.LayoutParams) linear3.getLayoutParams();
                    loparams3.weight = 1;
                    linear3.setLayoutParams(loparams3);
                    LinearLayout.LayoutParams loparams4 = (LinearLayout.LayoutParams) linear4.getLayoutParams();
                    loparams4.weight = 1;
                    linear4.setLayoutParams(loparams4);
                    LinearLayout.LayoutParams loparams5 = (LinearLayout.LayoutParams) linear5.getLayoutParams();
                    loparams5.weight = 1;
                    linear5.setLayoutParams(loparams5);
                } else if (position == 1) {
                    linear2.setBackgroundResource(R.color.colorPrimary);
                    linear1.setBackgroundResource(R.color.colorPrimaryDark);
                    linear3.setBackgroundResource(R.color.colorPrimaryDark);
                    linear4.setBackgroundResource(R.color.colorPrimaryDark);
                    linear5.setBackgroundResource(R.color.colorPrimaryDark);
                    tvnetwork.setVisibility(View.GONE);
                    tvrequest.setVisibility(View.GONE);
                    tvpost.setVisibility(View.GONE);
                    tvdiscover.setVisibility(View.GONE);
                    tvmap.setVisibility(View.VISIBLE);
                    tvmap.setTextColor(Color.parseColor("#ffffff"));
                    tvheader.setText("Map");
                    LinearLayout.LayoutParams loparams1 = (LinearLayout.LayoutParams) linear1.getLayoutParams();
                    loparams1.weight = 1;
                    linear1.setLayoutParams(loparams1);
                    LinearLayout.LayoutParams loparams2 = (LinearLayout.LayoutParams) linear2.getLayoutParams();
                    loparams2.weight = 4;
                    linear2.setLayoutParams(loparams2);
                    LinearLayout.LayoutParams loparams3 = (LinearLayout.LayoutParams) linear3.getLayoutParams();
                    loparams3.weight = 1;
                    linear3.setLayoutParams(loparams3);
                    LinearLayout.LayoutParams loparams4 = (LinearLayout.LayoutParams) linear4.getLayoutParams();
                    loparams4.weight = 1;
                    linear4.setLayoutParams(loparams4);
                    LinearLayout.LayoutParams loparams5 = (LinearLayout.LayoutParams) linear5.getLayoutParams();
                    loparams5.weight = 1;
                    linear5.setLayoutParams(loparams5);
                } else if (position == 2) {
                    linear3.setBackgroundResource(R.color.colorPrimary);
                    linear1.setBackgroundResource(R.color.colorPrimaryDark);
                    linear2.setBackgroundResource(R.color.colorPrimaryDark);
                    linear4.setBackgroundResource(R.color.colorPrimaryDark);
                    linear5.setBackgroundResource(R.color.colorPrimaryDark);
                    tvnetwork.setVisibility(View.GONE);
                    tvrequest.setVisibility(View.GONE);
                    tvpost.setVisibility(View.VISIBLE);
                    tvdiscover.setVisibility(View.GONE);
                    tvmap.setVisibility(View.GONE);
                    tvpost.setTextColor(Color.parseColor("#ffffff"));
                    tvheader.setText("My Posts");
                    LinearLayout.LayoutParams loparams1 = (LinearLayout.LayoutParams) linear1.getLayoutParams();
                    loparams1.weight = 1;
                    linear1.setLayoutParams(loparams1);
                    LinearLayout.LayoutParams loparams2 = (LinearLayout.LayoutParams) linear2.getLayoutParams();
                    loparams2.weight = 1;
                    linear2.setLayoutParams(loparams2);
                    LinearLayout.LayoutParams loparams3 = (LinearLayout.LayoutParams) linear3.getLayoutParams();
                    loparams3.weight = 4;
                    linear3.setLayoutParams(loparams3);
                    LinearLayout.LayoutParams loparams4 = (LinearLayout.LayoutParams) linear4.getLayoutParams();
                    loparams4.weight = 1;
                    linear4.setLayoutParams(loparams4);
                    LinearLayout.LayoutParams loparams5 = (LinearLayout.LayoutParams) linear5.getLayoutParams();
                    loparams5.weight = 1;
                    linear5.setLayoutParams(loparams5);
                } else if (position == 3) {
                    linear4.setBackgroundResource(R.color.colorPrimary);
                    linear1.setBackgroundResource(R.color.colorPrimaryDark);
                    linear2.setBackgroundResource(R.color.colorPrimaryDark);
                    linear3.setBackgroundResource(R.color.colorPrimaryDark);
                    linear5.setBackgroundResource(R.color.colorPrimaryDark);
                    tvnetwork.setVisibility(View.GONE);
                    tvrequest.setVisibility(View.VISIBLE);
                    tvpost.setVisibility(View.GONE);
                    tvdiscover.setVisibility(View.GONE);
                    tvmap.setVisibility(View.GONE);
                    tvrequest.setTextColor(Color.parseColor("#ffffff"));
                    tvheader.setText("New Requests");
                    LinearLayout.LayoutParams loparams1 = (LinearLayout.LayoutParams) linear1.getLayoutParams();
                    loparams1.weight = 1;
                    linear1.setLayoutParams(loparams1);
                    LinearLayout.LayoutParams loparams2 = (LinearLayout.LayoutParams) linear2.getLayoutParams();
                    loparams2.weight = 1;
                    linear2.setLayoutParams(loparams2);
                    LinearLayout.LayoutParams loparams3 = (LinearLayout.LayoutParams) linear3.getLayoutParams();
                    loparams3.weight = 1;
                    linear3.setLayoutParams(loparams3);
                    LinearLayout.LayoutParams loparams4 = (LinearLayout.LayoutParams) linear4.getLayoutParams();
                    loparams4.weight = 4;
                    linear4.setLayoutParams(loparams4);
                    LinearLayout.LayoutParams loparams5 = (LinearLayout.LayoutParams) linear5.getLayoutParams();
                    loparams5.weight = 1;
                    linear5.setLayoutParams(loparams5);
                } else if (position == 4) {
                    linear5.setBackgroundResource(R.color.colorPrimary);
                    linear1.setBackgroundResource(R.color.colorPrimaryDark);
                    linear2.setBackgroundResource(R.color.colorPrimaryDark);
                    linear3.setBackgroundResource(R.color.colorPrimaryDark);
                    linear4.setBackgroundResource(R.color.colorPrimaryDark);
                    tvnetwork.setVisibility(View.VISIBLE);
                    tvrequest.setVisibility(View.GONE);
                    tvpost.setVisibility(View.GONE);
                    tvdiscover.setVisibility(View.GONE);
                    tvmap.setVisibility(View.GONE);
                    tvnetwork.setTextColor(Color.parseColor("#ffffff"));
                    tvheader.setText("My Networks");
                    LinearLayout.LayoutParams loparams1 = (LinearLayout.LayoutParams) linear1.getLayoutParams();
                    loparams1.weight = 1;
                    linear1.setLayoutParams(loparams1);
                    LinearLayout.LayoutParams loparams2 = (LinearLayout.LayoutParams) linear2.getLayoutParams();
                    loparams2.weight = 1;
                    linear2.setLayoutParams(loparams2);
                    LinearLayout.LayoutParams loparams3 = (LinearLayout.LayoutParams) linear3.getLayoutParams();
                    loparams3.weight = 1;
                    linear3.setLayoutParams(loparams3);
                    LinearLayout.LayoutParams loparams4 = (LinearLayout.LayoutParams) linear4.getLayoutParams();
                    loparams4.weight = 1;
                    linear4.setLayoutParams(loparams4);
                    LinearLayout.LayoutParams loparams5 = (LinearLayout.LayoutParams) linear5.getLayoutParams();
                    loparams5.weight = 4;
                    linear5.setLayoutParams(loparams5);
                }
            }

            @Override
            public void onPageScrollStateChanged(final int state) {

            }
        });

        return view;
    }

    /**
     * pager adapter is created
     */
    private class MyPagerAdapter extends FragmentPagerAdapter implements AppConstants {
        /**
         * @param fm fragement manager is created
         */
        private MyPagerAdapter(final FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(final int position) {
            switch (position) {
                case 0:
                    return new DiscoverFragement().newInstance(DEFAULT_MODE);
                case 1:
                    return new MapFragement();
                case 2:
                    return new PostFragement().newInstance(POST_MODE);
                case 3:
                    return new RequestFragement();
                case 4:
                    return new NetworkFragement();
                default:
                    return new DiscoverFragement();
            }
        }

        @Override
        public int getCount() {
            return 5;
        }
    }

}
