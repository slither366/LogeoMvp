package com.example.myapplication.Interactors;

import com.example.myapplication.Interfaces.IUser;

public class User implements IUser {

    private String usuario, contraseña;

    public User() {
    }

    public User(String usuario, String contraseña) {
        this.usuario = usuario;
        this.contraseña = contraseña;
    }

    @Override
    public void setUser(String user) {
        usuario = user;
    }

    @Override
    public void setPassword(String pass) {
        contraseña = pass;
    }

    @Override
    public String getUser() {
        return usuario;
    }

    @Override
    public String getPassword() {
        return contraseña;
    }

    @Override
    public void validaDatos() {
        //Validaciones
    }
}
