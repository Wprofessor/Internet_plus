package com.example.pokestar.aitutravel.ui;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.pokestar.aitutravel.R;
import com.example.pokestar.aitutravel.adapter.Circle_adapter.CircleFragmentAdapter;
import com.example.pokestar.aitutravel.adapter.Circle_adapter.CircleListAdapter;
import com.example.pokestar.aitutravel.adapter.Circle_adapter.CircleTabAdapter;
import com.example.pokestar.aitutravel.base.BaseFragment;

import java.util.ArrayList;
import java.util.List;

public class CircleFragment extends BaseFragment {

    private CircleTabAdapter mcircleTabAdapter;
    private CircleFragmentAdapter mCircleFragmentAdapter;
    private TabLayout mTabLayout;
    private ViewPager mViewPager;

    private List<Fragment> circleListFragmentList;

    public CircleFragment() {
        // Required empty public constructor
    }


    public static CircleFragment newInstance(String text) {
        CircleFragment fragment = new CircleFragment();
        Bundle bundle = new Bundle();
        bundle.putString("text", text);
        fragment.setArguments(bundle);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_circle;
    }

    @Override
    protected int getContainerId() {
        return R.id.fragment_container;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_circle,container,false);
        mCircleFragmentAdapter = new CircleFragmentAdapter(getFragmentManager());
        mcircleTabAdapter = new CircleTabAdapter();
        mTabLayout = (TabLayout)view.findViewById(R.id.tabLayout);

        mViewPager = (ViewPager)view.findViewById(R.id.viewpage);
        initData();
        mViewPager.setAdapter(new FragmentStatePagerAdapter(getFragmentManager()) {
            @Override
            public Fragment getItem(int i) {
                return circleListFragmentList.get(i);
            }

            @Override
            public int getCount() {
                return circleListFragmentList.size();
            }
            @Override
            public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
                super.destroyItem(container, position, object);
            }

            @Nullable
            @Override
            public CharSequence getPageTitle(int position) {
                return super.getPageTitle(position);
            }
        });

        mTabLayout.setupWithViewPager(mViewPager);
        mTabLayout.setTabsFromPagerAdapter(mcircleTabAdapter);
        return view;
    }

    private void initData() {
        circleListFragmentList = new ArrayList<>();
//        for (int i = 0; i < 2; i++) {
            circleListFragmentList.add(CircleListFragment.newInstance(0));
        circleListFragmentList.add(fragment_address.newInstance());

    }


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

    }

    @Override
    public void onDetach() {
        super.onDetach();

    }

}
