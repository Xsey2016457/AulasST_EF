package com.example.gpsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.gpsapp.ui.main.Usuario;
import com.example.gpsapp.ui.main.daoUsuario;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText user, pass;
    Button btnIniciar, btnRegistrar;
    daoUsuario dao;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        user = (EditText) findViewById(R.id.et_nombre);
        pass = (EditText) findViewById(R.id.et_pass);
        btnIniciar = (Button) findViewById(R.id.btn_ingresar);
        btnRegistrar = (Button) findViewById(R.id.btn_reg);

        btnIniciar.setOnClickListener(this);
        btnRegistrar.setOnClickListener(this);
        dao=new daoUsuario(this);

    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_ingresar:
                String u=user.getText().toString();
                String p=pass.getText().toString();
                if(u.equals("")&&p.equals("")){
                    Toast.makeText(this, "ERROR : Campos vacios", Toast.LENGTH_LONG).show();
                }else if (dao.login(u,p)==1){
                    Usuario ux=dao.getUsuario(u,p);
                    Toast.makeText(this, "Datos Correctos", Toast.LENGTH_LONG).show();
                    Intent i2=new Intent(MainActivity.this,MainMenu.class);
                    i2.putExtra("Id", ux.getId());
                    startActivity(i2);
                    finish();
                }else{
                    Toast.makeText(this, "ERROR : Datos Erroneos", Toast.LENGTH_LONG).show();

                }

                break;

            case  R.id.btn_reg:
                Intent i=new Intent(MainActivity.this,MainRegistar.class);
                startActivity(i);
                break;
        }
    }
}
