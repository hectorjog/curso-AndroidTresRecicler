package com.example.petagram;



import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import java.util.ArrayList;

public class MascotasFavoritas extends AppCompatActivity {

    ArrayList<Mascotas> mascotasFavoritas;
    private RecyclerView listaMascotasFavoritas;
    Activity activity;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mascotas_favoritas);


        Toolbar toolbar = (Toolbar) findViewById(R.id.misFavoritos);

        setSupportActionBar(toolbar);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setDisplayShowTitleEnabled(false);


        listaMascotasFavoritas = (RecyclerView) findViewById(R.id.reciclerFavoritas);

        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        listaMascotasFavoritas.setLayoutManager(llm);

        inicializarListaMascotas();
        inicializarAdaptador();


    }


    public void inicializarAdaptador(){
        MascotasFavoritasAdaptador adaptador = new MascotasFavoritasAdaptador(mascotasFavoritas, this);
        listaMascotasFavoritas.setAdapter(adaptador);
    }

    public void inicializarListaMascotas(){
        mascotasFavoritas = new ArrayList<Mascotas>();
        mascotasFavoritas.add(new Mascotas("Sparky",false, 3, R.drawable.elephant));
        mascotasFavoritas.add(new Mascotas("Munchy",false, 2, R.drawable.sheep));
        mascotasFavoritas.add(new Mascotas("Puppy",false, 4, R.drawable.pinguino));
        mascotasFavoritas.add(new Mascotas("Neron",false, 1, R.drawable.bear));
        mascotasFavoritas.add(new Mascotas("Milo",false, 3, R.drawable.monkey));


    }
}
