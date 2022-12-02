package com.example.gpsapp.ui.main;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.media.Image;
import android.os.Build;
import android.telecom.Call;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.gpsapp.MainSedePedro;
import com.example.gpsapp.R;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class AdapterCard extends RecyclerView.Adapter<AdapterCard.CardViewHolder> {
    private List<Card> listaCard;

    public AdapterCard(List<Card> listaCard) {
        this.listaCard = listaCard;
    }


    public CardViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.card_view, viewGroup, false);
        return new CardViewHolder(v);
    }

    @Override
    public void onBindViewHolder(CardViewHolder cardViewHolder, int i) {
        cardViewHolder.ivImagen.setImageResource(listaCard.get(i).getImgResource());
        cardViewHolder.tvtitulo.setText(listaCard.get(i).getTitulo());
    }

    @Override
    public int getItemCount() {
        return listaCard.size();
    }

    public class CardViewHolder extends RecyclerView.ViewHolder {

        ImageView ivImagen;
        TextView tvtitulo;

        public CardViewHolder(View itemView) {
            super(itemView);

            ivImagen = itemView.findViewById(R.id.image);
            tvtitulo = itemView.findViewById(R.id.tvnombre);


        }
    }
}