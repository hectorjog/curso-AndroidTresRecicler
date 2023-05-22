package com.example.petagram;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


import java.util.ArrayList;

public class MascotasFavoritasAdaptador extends RecyclerView.Adapter<MascotasFavoritasAdaptador.MascotaFavoritaViewHolder>{

    ArrayList<Mascotas> mascotasFavoritas;
    Activity activity;



    public MascotasFavoritasAdaptador(ArrayList<Mascotas> mascotasFavoritas, Activity activity) {
        this.mascotasFavoritas = Mascotas.mascotasFavoritasArray;
        this.activity = activity;
    }

    @Override
    public MascotaFavoritaViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_favoritos, parent, false);
        return new MascotaFavoritaViewHolder(v);
    }

    @Override
    public void onBindViewHolder(MascotaFavoritaViewHolder mascotaFavoritaViewHolder, int position) {
        final Mascotas mascotaFavorita = mascotasFavoritas.get(position);

        mascotaFavoritaViewHolder.imgFotoFavorita.setImageResource(mascotaFavorita.getFoto());
        Integer rating = mascotaFavorita.getRating();
        mascotaFavoritaViewHolder.tvRatingFavorita.setText(rating.toString());

    }

    @Override
    public int getItemCount() {
        return mascotasFavoritas.size();
    }


    public static class MascotaFavoritaViewHolder extends RecyclerView.ViewHolder{

        private ImageView imgFotoFavorita;
        private TextView tvRatingFavorita;


        public MascotaFavoritaViewHolder(View itemView) {
            super(itemView);
            imgFotoFavorita      = (ImageView) itemView.findViewById(R.id.imgFotoFavorita);
            tvRatingFavorita   = (TextView) itemView.findViewById(R.id.tvRatingFavorita);

        }
    }


}