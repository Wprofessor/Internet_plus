package com.example.pokestar.aitutravel.adapter.Discovery_adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.pokestar.aitutravel.R;
import com.example.pokestar.aitutravel.bean.discovery.recommend_item;

import java.util.List;

public class RecommendAdapter extends RecyclerView.Adapter<RecommendAdapter.ViewHolder> {

    private List<recommend_item> recommend_items;

    public RecommendAdapter(List<recommend_item> recommend_items) {
        this.recommend_items = recommend_items;
    }

    private Context context;

    @NonNull
    @Override
    public RecommendAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.recommend_item, viewGroup, false);
        context = viewGroup.getContext();
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecommendAdapter.ViewHolder viewHolder, int i) {
        recommend_item recommendItem = recommend_items.get(i);
        viewHolder.recommendImage.setImageResource(recommendItem.getRecommendimage());
        viewHolder.recommendtitle.setText(recommendItem.getRecommendtitle());
        viewHolder.recommendcontent.setText(recommendItem.getRecommendcontent());
        viewHolder.recommendvalue.setText(recommendItem.getRecommendvalue());
    }

    @Override
    public int getItemCount() {
        return recommend_items.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private ImageView recommendImage;
        private TextView recommendtitle,recommendcontent,recommendvalue;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            recommendImage = (ImageView)itemView.findViewById(R.id.recommend_image);
            recommendtitle = (TextView)itemView.findViewById(R.id.recommend_title);
            recommendcontent = (TextView)itemView.findViewById(R.id.recommend_content);
            recommendvalue = (TextView)itemView.findViewById(R.id.recommend_value);
        }
    }
}
