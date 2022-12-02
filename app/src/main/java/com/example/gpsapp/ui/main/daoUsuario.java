package com.example.gpsapp.ui.main;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;

public class daoUsuario {
    Context c;
    Usuario u;
    ArrayList<Usuario> lista;
    SQLiteDatabase sql;
    String bd = "BDUsuaios";
    String tabla = "create table if not exists usuario( id interger primary key , usuario text, pass text, nombre text, ap text)";

    public daoUsuario(Context c) {
        this.c = c;
        sql = c.openOrCreateDatabase(bd, c.MODE_PRIVATE, null);
        sql.execSQL(tabla);
        u = new Usuario();
    }

    public boolean insertUsuario(Usuario u) {
        if (buscar(u.getUsusario()) == 0) {
            ContentValues cv = new ContentValues();
            cv.put("usuario", u.getUsusario());
            cv.put("pass", u.getContras());
            cv.put("nombre", u.getNombre());
            cv.put("ap", u.getApellido());
            return (sql.insert("usuario", null, cv) > 0);

        } else {
            return false;
        }
    }

    public int buscar(String u) {
        int x = 0;
        lista = selectUsuarios();
        for (Usuario us : lista) {
            if (us.getUsusario().equals(u)) {
                x++;
            }
        }
        return x;

    }

    public ArrayList<Usuario> selectUsuarios() {
        ArrayList<Usuario> lista = new ArrayList<Usuario>();
        lista.clear();
        Cursor cr = sql.rawQuery("select * from usuario", null);
        if (cr != null && cr.moveToFirst()) {
            do {
                Usuario u = new Usuario();
                u.setId(cr.getInt(0));
                u.setUsusario(cr.getString(1));
                u.setContras(cr.getString(2));
                u.setNombre(cr.getString(3));
                u.setApellido(cr.getString(4));
                lista.add(u);
            } while (cr.moveToNext());
        }
        return lista;
    }

    public int login(String u, String p) {
        int a=0;
        Cursor cr = sql.rawQuery("select * from usuario", null);
        if (cr != null && cr.moveToFirst()) {
            do {
                if (cr.getString(1).equals(u)&&cr.getString(2).equals(p)){
                    a++;

                }
            } while (cr.moveToNext());
        }
        return a;

    }
    public Usuario getUsuarioById(int id){
        lista=selectUsuarios();
        for (Usuario us:lista){
            if (us.getId()==id){
                return us;
            }
        }
        return null;
    }
    public Usuario getUsuario(String u, String p){
        lista=selectUsuarios();
        for (Usuario us:lista){
            if (us.getUsusario().equals(u)&&us.getContras().equals(p)){
                return us;
            }
        }
        return null;
    }

}
