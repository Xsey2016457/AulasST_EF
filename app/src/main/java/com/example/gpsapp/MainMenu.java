package com.example.gpsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

import com.example.gpsapp.ui.main.Usuario;
import com.example.gpsapp.ui.main.daoUsuario;

public class MainMenu extends AppCompatActivity {

    TextView tv1, tv2;
    //int id=0;
    //Usuario u;
    //daoUsuario dao;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main_menu);

        tv1 = (TextView) findViewById(R.id.welcome_id);

        //Bundle b = getIntent().getExtras();
        //id = b.getInt("id");
        //dao=new daoUsuario(this);
        //u=dao.getUsuarioById(u.getId());

        //tv1.setText("Bienvenido "+u.getNombre()+" "+u.getApellido());

    }

    public void icon_salir(View view) {
        Intent salir = new Intent(MainMenu.this, MainActivity.class);
        startActivity(salir);
    }

    public void icon_sedes(View view) {
        Intent sedes = new Intent(MainMenu.this, MainMenuSedes.class);
        startActivity(sedes);
    }

    public void icon_maps(View view) {
        Intent maps = new Intent(MainMenu.this, MapsActivity.class);
        startActivity(maps);
    }
}