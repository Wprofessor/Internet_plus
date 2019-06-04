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
        viewHolder.text_recommend.setText(recommendItem.getText_recommend());

        viewHolder.recommendImage_one.setImageResource(recommendItem.getRecommendimage_one());
        viewHolder.recommendtitle_one.setText(recommendItem.getRecommendtitle_one());
        viewHolder.recommendcontent_one.setText(recommendItem.getRecommendcontent_one());
        viewHolder.recommendvalue_one.setText(recommendItem.getRecommendvalue_one());

        viewHolder.recommendImage_two.setImageResource(recommendItem.getRecommendimage_two());
        viewHolder.recommendtitle_two.setText(recommendItem.getRecommendtitle_two());
        viewHolder.recommendcontent_two.setText(recommendItem.getRecommendcontent_two());
        viewHolder.recommendvalue_two.setText(recommendItem.getRecommendvalue_two());

    }

    @Override
    public int getItemCount() {
        return recommend_items.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private ImageView recommendImage;
        private TextView recommendtitle, recommendcontent, recommendvalue, text_recommend;

        private ImageView recommendImage_one;
        private TextView recommendtitle_one, recommendcontent_one, recommendvalue_one;

        private ImageView recommendImage_two;
        private TextView recommendtitle_two, recommendcontent_two, recommendvalue_two;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            text_recommend = (TextView) itemView.findViewById(R.id.text_recommend);
            recommendImage = (ImageView) itemView.findViewById(R.id.recommend_image);
            recommendtitle = (TextView) itemView.findViewById(R.id.recommend_title);
            recommendcontent = (TextView) itemView.findViewById(R.id.recommend_content);
            recommendvalue = (TextView) itemView.findViewById(R.id.recommend_value);

            recommendImage_one = (ImageView) itemView.findViewById(R.id.recommend_image_one);
            recommendtitle_one = (TextView) itemView.findViewById(R.id.recommend_title_one);
            recommendcontent_one = (TextView) itemView.findViewById(R.id.recommend_content_one);
            recommendvalue_one = (TextView) itemView.findViewById(R.id.recommend_value_one);

            recommendImage_two = (ImageView) itemView.findViewById(R.id.recommend_image_two);
            recommendtitle_two = (TextView) itemView.findViewById(R.id.recommend_title_two);
            recommendcontent_two = (TextView) itemView.findViewById(R.id.recommend_content_two);
            recommendvalue_two = (TextView) itemView.findViewById(R.id.recommend_value_two);
        }
    }
}
