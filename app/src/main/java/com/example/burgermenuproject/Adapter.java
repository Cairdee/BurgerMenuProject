package com.example.burgermenuproject;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    Context context;
    List<Item> item;

    public Adapter(Context context, List<Item> item) {
        this.context = context;
        this.item = item;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.fragment_food, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Item currentItem = item.get(position);
        holder.ItemName.setText(currentItem.getNameItem());
        holder.ItemDescription.setText(currentItem.getDescriptionItem());
        Glide.with(context).load(currentItem.getImage()).into(holder.ItemIcon);
    }

    @Override
    public int getItemCount() {
        return item.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView ItemIcon;
        TextView ItemName, ItemDescription;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            ItemIcon = itemView.findViewById(R.id.ivItemIcons);
            ItemName = itemView.findViewById(R.id.tvNameItem);
            ItemDescription = itemView.findViewById(R.id.tvDescriptionItem);
        }
    }
}
