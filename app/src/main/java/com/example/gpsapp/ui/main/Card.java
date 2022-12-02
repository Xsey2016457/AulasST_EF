package com.example.gpsapp.ui.main;

import java.io.Serializable;

public class Card implements Serializable {
    private String titulo;

    private int img;

    public Card(String titulo, int imgResource) {
        this.titulo = titulo;

        this.img = imgResource;
    }

    public String getTitulo() {
        return titulo;
    }



    public int getImgResource() {
        return img;
    }
}