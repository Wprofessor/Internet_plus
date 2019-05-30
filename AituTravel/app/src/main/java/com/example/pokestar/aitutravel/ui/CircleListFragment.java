package com.example.pokestar.aitutravel.ui;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.pokestar.aitutravel.R;
import com.example.pokestar.aitutravel.adapter.Circle_adapter.CircleListAdapter;
import com.example.pokestar.aitutravel.bean.circle.CircleBean;
import com.example.pokestar.aitutravel.bean.circle.CircleConstant;
import com.example.pokestar.aitutravel.bean.circle.Circle_Item;

import java.util.ArrayList;
import java.util.List;

public class CircleListFragment extends Fragment{

    private RecyclerView mRecyclerView;
    private List<Circle_Item> circle_items = new ArrayList<>();
    private int classId;


    private Circle_Item[][] circleItems = {
            {new Circle_Item(R.drawable.ic_launcher_foreground,"张三","lalalal"),
                    new Circle_Item(R.drawable.ic_launcher_foreground,"李四","hahaha"),}
                    ,{new Circle_Item(R.drawable.ic_launcher_foreground,"jack","fdsfds"),
            new Circle_Item(R.drawable.ic_launcher_foreground,"rose","treter")}
    };

    private CircleListAdapter circleListAdapter;

    public static CircleListFragment newInstance(int classId) {
        CircleListFragment circleListFragment = new CircleListFragment();
        Bundle args = new Bundle();
        args.putInt(CircleConstant.ARGUMENT_CLASS_ID, classId);
        circleListFragment.setArguments(args);
        return circleListFragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_circle_list,null,false);
        classId = getArguments().getInt(CircleConstant.ARGUMENT_CLASS_ID);
        mRecyclerView = (RecyclerView)view.findViewById(R.id.rv_circlelist);
        initData();
        circleListAdapter = new CircleListAdapter(circle_items);
        mRecyclerView.setAdapter(circleListAdapter);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(container.getContext()));
        mRecyclerView.addItemDecoration(new DividerItemDecoration(container.getContext(),DividerItemDecoration.VERTICAL));
        return view;
    }

    private void initData() {
        for (int i = 0; i < circleItems[classId].length; i++) {
            circle_items.add(circleItems[classId][i]);
        }
    }
}
