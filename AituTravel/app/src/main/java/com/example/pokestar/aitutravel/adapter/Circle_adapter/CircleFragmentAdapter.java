package com.example.pokestar.aitutravel.adapter.Circle_adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.pokestar.aitutravel.bean.circle.CircleBean;
import com.example.pokestar.aitutravel.bean.circle.CircleConstant;
import com.example.pokestar.aitutravel.ui.CircleListFragment;

public class CircleFragmentAdapter extends FragmentPagerAdapter {

    private CircleBean[] classes = CircleConstant.getCircleClass();

    public CircleFragmentAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        CircleBean clazz = classes[i];
        return CircleListFragment.newInstance(clazz.getId());
    }

    @Override
    public int getCount() {
        return classes.length;
    }
}
