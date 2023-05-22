package com.example.petagram;

import java.io.Serializable;
import java.util.ArrayList;

public class Mascotas implements Serializable {
    private String nombre;
    private boolean favorito;
    private int rating;
    private int foto;
    public static ArrayList<Mascotas> mascotasFavoritasArray = new ArrayList<Mascotas>();

    public Mascotas( String nombre, boolean favorito, int rating, int foto){
        this.nombre = nombre;
        this.favorito = favorito;
        this.rating = rating;
        this.foto = foto;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public boolean isFavorito() {
        return favorito;
    }

    public void setFavorito(boolean favorito) {
        this.favorito = favorito;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }


}