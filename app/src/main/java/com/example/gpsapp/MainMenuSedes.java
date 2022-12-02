package com.example.gpsapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.gpsapp.ui.main.AdapterCard;
import com.example.gpsapp.ui.main.Card;

import java.util.ArrayList;
import java.util.List;

public class MainMenuSedes extends AppCompatActivity {
    List<Card> listaCard;

    private RecyclerView rvUsuarios;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager lManager;


        protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu_sedes);

      //  rvUsuarios = findViewById(R.id.rvlista);

      //  listaCard = new ArrayList<Card>();

     //   listaCard.add(new Card("Sede Pedro de Valdivia",  R.drawable.sede1));
      // listaCard.add(new Card("Sede Rodriguez", R.drawable.sede2));



      //  rvUsuarios.setHasFixedSize(true);

       // lManager = new LinearLayoutManager(this);
        //rvUsuarios.setLayoutManager(lManager);

       // adapter = new AdapterCard(listaCard);
      //  rvUsuarios.setAdapter(adapter);

    }
    public void btn_pedro(View view) {
        Intent btn_pedro = new Intent(MainMenuSedes.this, MainSedePedro.class);
        startActivity(btn_pedro);
    }
    public void btn_rodriguez(View view) {
        Toast.makeText(this, "Opcion no Disponible", Toast.LENGTH_LONG).show();
    }


    public void btn_volver(View view) {
        Intent volver = new Intent(MainMenuSedes.this, MainMenu.class);
        startActivity(volver);
    }
}

