package com.example.uitask.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.uitask.R;

import java.util.List;

public class HomeProductHighlightAdapter extends RecyclerView.Adapter<HomeProductHighlightAdapter.HighLightAdapter> {
   private List productList;

    public HomeProductHighlightAdapter(List productList) {
        this.productList = productList;
    }

    @NonNull
    @Override
    public HighLightAdapter onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.home_product_favourite_item,parent,false);

        return new HighLightAdapter(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HighLightAdapter holder, int position) {
        holder.productImg.setImageResource(R.drawable.favourite_food);

    }

    @Override
    public int getItemCount() {
        return productList.size();
    }

    class HighLightAdapter extends RecyclerView.ViewHolder{
        ImageView productImg;
        public HighLightAdapter(@NonNull View itemView) {
            super(itemView);
            productImg=(ImageView) itemView.findViewById(R.id.cart_image);
        }
    }
}
