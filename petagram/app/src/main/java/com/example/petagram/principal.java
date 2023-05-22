package com.example.petagram;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.*;
import android.os.Bundle;
import android.support.v7.widget.*;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import java.util.ArrayList;

public class principal extends AppCompatActivity {
    ArrayList<Mascotas> lasmascotas;
    private RecyclerView listadoMascotas;
    public static ArrayList<Mascotas> lasFavoritas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        listadoMascotas = (RecyclerView) findViewById(R.id.reciclerMascotas);

        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        listadoMascotas.setLayoutManager(llm);

        inicializarListaMascotas();
        inicializarAdaptador();

        ImageView cartoonFavoritos = (ImageView) findViewById(R.id.cartoonFavoritos);
        cartoonFavoritos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(principal.this, MascotasFavoritas.class);
                principal.this.startActivity(intent);
            }
        });
    }


    public void inicializarAdaptador(){
        MascotaAdaptador adaptador = new MascotaAdaptador(lasmascotas, this);
        listadoMascotas.setAdapter(adaptador);
    }

    public void inicializarListaMascotas(){
        lasmascotas = new ArrayList<Mascotas>();
        lasmascotas.add(new Mascotas("Oveha",false, 3, R.drawable.sheep));
        lasmascotas.add(new Mascotas("Penguein",false, 2, R.drawable.pinguino));
        lasmascotas.add(new Mascotas("Yogy",false, 4, R.drawable.bear));
        lasmascotas.add(new Mascotas("Dumbo",false, 1, R.drawable.elephant));
        lasmascotas.add(new Mascotas("King Kong",false, 3, R.drawable.monkey));

    }


}
