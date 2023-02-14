package com.example.uitask.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.uitask.R;

import java.util.List;

public class HomeProductAdapter extends RecyclerView.Adapter<HomeProductAdapter.HomeProductHolder> {
    private List productList;
    public HomeProductAdapter(List productList) {
        this.productList = productList;
    }


    @NonNull
    @Override
    public HomeProductHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.home_product_item,parent,false);

        return new HomeProductHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull HomeProductHolder holder, int position) {
        holder.productImg.setImageResource(R.drawable.vegetable);

    }

    @Override
    public int getItemCount() {
        return productList.size();
    }

    class HomeProductHolder extends RecyclerView.ViewHolder{
        ImageView productImg;
        TextView title,description;

        public HomeProductHolder(@NonNull View itemView) {
            super(itemView);
            productImg=(ImageView)itemView.findViewById(R.id.home_product_image);
            title=(TextView)itemView.findViewById(R.id.home_product_title);
            description=(TextView) itemView.findViewById(R.id.home_product_des);
        }
    }
}
