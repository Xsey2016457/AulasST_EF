package com.example.gpsapp.ui.main;

public class Usuario {
    int id;
    String Nombre, Apellido, Ususario, Contras;

    public Usuario() {
    }

    public Usuario(String nombre, String apellido, String ususario, String contras) {
        Nombre = nombre;
        Apellido = apellido;
        Ususario = ususario;
        Contras = contras;
    }

    public boolean isNull(){
        if(Nombre.equals("")&&Apellido.equals("")&&Ususario.equals("")&&Contras.equals("")){
            return false;
        }else{
            return true;
        }
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", Nombre='" + Nombre + '\'' +
                ", Apellido='" + Apellido + '\'' +
                ", Ususario='" + Ususario + '\'' +
                ", Contras='" + Contras + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public String getUsusario() {
        return Ususario;
    }

    public void setUsusario(String ususario) {
        Ususario = ususario;
    }

    public String getContras() {
        return Contras;
    }

    public void setContras(String contras) {
        Contras = contras;
    }
}
