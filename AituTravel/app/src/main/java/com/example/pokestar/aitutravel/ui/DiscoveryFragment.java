package com.example.pokestar.aitutravel.ui;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.pokestar.aitutravel.R;
import com.example.pokestar.aitutravel.adapter.Discovery_adapter.RecommendAdapter;
import com.example.pokestar.aitutravel.base.BaseFragment;
import com.example.pokestar.aitutravel.bean.discovery.recommend_item;

import java.util.ArrayList;
import java.util.List;


public class DiscoveryFragment extends BaseFragment {

    private ViewPager mViewPager;
    private List<View> mList = new ArrayList<>();
    private View view1, view2, view3;
    private ImageView point1, point2, point3;


    private RecyclerView mrecyclerView;
    private RecommendAdapter recommendAdapter;
    private List<recommend_item> recommendItems;
    private Context context;

    public DiscoveryFragment() {
        // Required empty public constructor
    }


    public static DiscoveryFragment newInstance() {
        DiscoveryFragment fragment = new DiscoveryFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_discovery;
    }

    @Override
    protected int getContainerId() {
        return R.id.fragment_container;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_discovery, container, false);
        // Inflate the layout for this fragment
        point1 = (ImageView) view.findViewById(R.id.point1);
        point2 = (ImageView) view.findViewById(R.id.point2);
        point3 = (ImageView) view.findViewById(R.id.point3);
        mViewPager = (ViewPager) view.findViewById(R.id.adcertis_viewpager);
        initview();

        mrecyclerView = (RecyclerView)view.findViewById(R.id.recommend_recycle);
        initData();
        recommendAdapter = new RecommendAdapter(recommendItems);
        mrecyclerView.setAdapter(recommendAdapter);
        mrecyclerView.setLayoutManager(new LinearLayoutManager(context));
        return view;
    }

    private void initData() {
        recommendItems = new ArrayList<>();
        for (int i = 0; i < 7; i++) {
            recommendItems.add(new recommend_item(R.mipmap.ic_launcher,"汾河二库","环境优美，项目刺激","¥40起"));
        }
    }

    private void initview() {
        setPoint(true, false, false);
        //监听滑动
        mViewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int i, float v, int i1) {

            }

            //切换
            @Override
            public void onPageSelected(int i) {
                switch (i) {
                    case 0:
                        setPoint(true, false, false);
                        break;
                    case 1:
                        setPoint(false, true, false);
                        break;
                    case 2:
                        setPoint(false, false, true);
                        break;
                }
            }

            @Override
            public void onPageScrollStateChanged(int i) {

            }
        });
//相当于初始化view
        view1 = View.inflate(getContext(), R.layout.page_item_one, null);
        view2 = View.inflate(getContext(), R.layout.page_item_two, null);
        view3 = View.inflate(getContext(), R.layout.page_item_three, null);

        //view里面的控件

        mList.add(view1);
        mList.add(view2);
        mList.add(view3);
        //设置viewpager适配器
        mViewPager.setAdapter(new GuideAdapter());
    }

    class GuideAdapter extends PagerAdapter {

        @Override
        public int getCount() {
            return mList.size();
        }

        @Override
        public boolean isViewFromObject(@NonNull View view, @NonNull Object o) {
            return view == o;
        }

        @NonNull
        @Override
        public Object instantiateItem(@NonNull ViewGroup container, int position) {
            ((ViewPager) container).addView(mList.get(position));
            return mList.get(position);
        }

        @Override
        public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
            ((ViewPager) container).removeView(mList.get(position));
        }
    }

    //设置小圆点选中效果
    public void setPoint(boolean isCheck1, boolean isCheck2, boolean isCheck3) {
        if (isCheck1) {
            point1.setImageResource(R.drawable.ic_point_on);
        } else {
            point1.setImageResource(R.drawable.ic_point_off);
        }
        if (isCheck2) {
            point2.setImageResource(R.drawable.ic_point_on);
        } else {
            point2.setImageResource(R.drawable.ic_point_off);
        }
        if (isCheck3) {
            point3.setImageResource(R.drawable.ic_point_on);
        } else {
            point3.setImageResource(R.drawable.ic_point_off);
        }
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
