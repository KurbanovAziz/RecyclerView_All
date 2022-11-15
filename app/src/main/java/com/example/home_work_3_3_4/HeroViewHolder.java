package com.example.home_work_3_3_4;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class HeroViewHolder extends RecyclerView.ViewHolder {
    private TextView tvHero;

    public HeroViewHolder(@NonNull View itemView) {
        super(itemView);
        tvHero = itemView.findViewById(R.id.tv_hero);
    }

    public void bind(String hero){
        tvHero.setText(hero);
    }
}
