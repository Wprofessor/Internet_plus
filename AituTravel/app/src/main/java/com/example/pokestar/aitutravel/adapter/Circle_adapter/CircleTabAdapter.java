package com.example.pokestar.aitutravel.adapter.Circle_adapter;

import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.view.View;

import com.example.pokestar.aitutravel.bean.circle.CircleBean;
import com.example.pokestar.aitutravel.bean.circle.CircleConstant;

public class CircleTabAdapter extends PagerAdapter{

    private CircleBean[]  classes = CircleConstant.getCircleClass();

    @Override
    public int getCount() {
        return classes.length;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return classes[position].getData();
    }


    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object o) {
        return false;
    }
}
