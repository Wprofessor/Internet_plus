package com.example.pokestar.aitutravel.ui;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
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
    private ImageView page_one,page_two,page_three;

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
        // 将滑动效果分成两列
//        GridLayoutManager layoutManager = new GridLayoutManager(context, 2);
        mrecyclerView.setLayoutManager(new LinearLayoutManager(container.getContext()));
        return view;
    }

    private void initData() {
        recommendItems = new ArrayList<>();
            recommendItems.add(new recommend_item("http://ww1.sinaimg.cn/large/0065JbNQly1g3p72joqqhj30u01e01ji.jpg",
                    "樱花文化","汉服体验，樱花隧道，小动物，美食节","¥38起","当季推荐",
                    "http://ww1.sinaimg.cn/large/0065JbNQly1g3p730foctj30fq0m8tgh.jpg","水密芭莎","各式温泉，影厅，书吧","¥149",
                   "http://ww1.sinaimg.cn/large/0065JbNQly1g3p734a4jpj30fa0m811i.jpg","双岛之恋","吹海风，看日落","¥668起"));
            recommendItems.add(new recommend_item("http://ww1.sinaimg.cn/large/0065JbNQly1g3p73awgsyj30u01901kx.jpg",
                    "海盗传奇水世界","你准备好了吗?","¥128起","热门推荐",
                    "http://ww1.sinaimg.cn/large/0065JbNQly1g3p73ffzh4j30ty0vv7b5.jpg","策马寻沙","鲜花草原&大漠驼铃","¥398起",
                    "http://ww1.sinaimg.cn/large/0065JbNQly1g3p73in2nuj30om0l07aw.jpg","逃跑计划","激情漂流+星空露营+民营篝火","¥300起"));

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
        page_one = view1.findViewById(R.id.page_one);
        page_two = view2.findViewById(R.id.page_two);
        page_three = view3.findViewById(R.id.page_three);

        Glide.with(getContext()).load("http://ww1.sinaimg.cn/large/0065JbNQly1g3peusz9paj30oq09gwke.jpg").into(page_one);
        Glide.with(getContext()).load("http://ww1.sinaimg.cn/large/0065JbNQly1g3pev2q0sdj30hs0axn0p.jpg").into(page_two);
        Glide.with(getContext()).load("http://ww1.sinaimg.cn/large/0065JbNQly1g3pev6v9vwj31900ty4he.jpg").into(page_three);
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
