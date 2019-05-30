package com.example.pokestar.aitutravel.adapter.Circle_adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.pokestar.aitutravel.R;
import com.example.pokestar.aitutravel.bean.circle.CircleBean;
import com.example.pokestar.aitutravel.bean.circle.Circle_Item;

import java.util.List;

public class CircleListAdapter extends RecyclerView.Adapter<CircleListAdapter.ViewHolder> {

    private Context mcontext;
    private List<Circle_Item> mCircleItems;

    public CircleListAdapter(List<Circle_Item> mCircleItems) {
        this.mCircleItems = mCircleItems;
    }

    @NonNull
    @Override
    public CircleListAdapter.ViewHolder onCreateViewHolder(@NonNull final ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.item_circle, viewGroup, false);
        final ViewHolder holder = new ViewHolder(view);
        mcontext = viewGroup.getContext();
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int position = holder.getAdapterPosition();
                Toast.makeText(viewGroup.getContext(), "你点了" + String.valueOf(position), Toast.LENGTH_SHORT).show();
            }
        });
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull CircleListAdapter.ViewHolder viewHolder, int i) {
        Circle_Item circle_item = mCircleItems.get(i);
        viewHolder.title.setText(circle_item.getTitle());
        viewHolder.source.setText(circle_item.getSource());
        viewHolder.imageView.setImageResource(circle_item.getImage());
    }

    @Override
    public int getItemCount() {
        return mCircleItems.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {

        private TextView title,source;
        private ImageView imageView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            title = (TextView)itemView.findViewById(R.id.tv_circle_title);
            source = (TextView)itemView.findViewById(R.id.tv_circle_source);
            imageView = (ImageView)itemView.findViewById(R.id.img_circle);
        }
    }
}
