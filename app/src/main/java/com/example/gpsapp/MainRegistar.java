package com.example.gpsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.gpsapp.ui.main.Usuario;
import com.example.gpsapp.ui.main.daoUsuario;

public class MainRegistar extends AppCompatActivity implements View.OnClickListener {
EditText us, pas, nom, ape;
Button reg,canc;
daoUsuario dao;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_registar);
        us = (EditText) findViewById(R.id.et_regusu);
        pas = (EditText) findViewById(R.id.et_regpass);
        nom = (EditText) findViewById(R.id.et_regNombre);
        ape = (EditText) findViewById(R.id.et_regape);
        reg = (Button) findViewById(R.id.btn_regist);
        canc = (Button) findViewById(R.id.btn_regCancelar);

        reg.setOnClickListener(this);
        canc.setOnClickListener(this);
        dao=new daoUsuario(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_regist:
                 Usuario u=new Usuario();
                 u.setUsusario(us.getText().toString());
                 u.setContras(pas.getText().toString());
                 u.setNombre(nom.getText().toString());
                 u.setApellido(ape.getText().toString());
                 if (!u.isNull()){
                     Toast.makeText(this, "Error : Campos vacios", Toast.LENGTH_LONG).show();

                 }else  if (dao.insertUsuario(u)){
                     Toast.makeText(this, "Registro Existoso", Toast.LENGTH_LONG).show();
                     Intent i2=new Intent(MainRegistar.this,MainActivity.class);
                     startActivity(i2);
                     finish();

                 }else  {
                     Toast.makeText(this, "Error : Usuario ya Registrado", Toast.LENGTH_LONG).show();
                 }
                break;

            case  R.id.btn_regCancelar:
                Intent i=new Intent(MainRegistar.this,MainActivity.class);
                startActivity(i);
                finish();
                break;
        }
    }
}
