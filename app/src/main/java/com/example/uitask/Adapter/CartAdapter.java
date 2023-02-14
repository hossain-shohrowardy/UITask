package com.example.uitask.Adapter;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.uitask.R;

import java.util.List;

public class CartAdapter extends RecyclerView.Adapter<CartAdapter.CartHolder> {
  private List productList;

    public CartAdapter(List productList) {
        this.productList = productList;
    }

    @NonNull
    @Override
    public CartHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.cart_product_item,parent,false);

        return new CartHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CartHolder holder, int position) {
        holder.favouriteImg.setImageResource(R.drawable.fav);
        holder.productImg.setImageResource(R.drawable.apple);

    }

    @Override
    public int getItemCount() {
        return productList.size();
    }

    class CartHolder extends RecyclerView.ViewHolder{
        ImageView productImg,favouriteImg;
        TextView title,price;
        Button addToCart;

        public CartHolder(@NonNull View itemView) {
            super(itemView);
            productImg=(ImageView)itemView.findViewById(R.id.cart_img);
            favouriteImg=(ImageView)itemView.findViewById(R.id.favourite_img);
            title=(TextView)itemView.findViewById(R.id.cart_title);
            price=(TextView) itemView.findViewById(R.id.cart_price);
            addToCart=(Button) itemView.findViewById(R.id.cart_button);
        }
    }
}
