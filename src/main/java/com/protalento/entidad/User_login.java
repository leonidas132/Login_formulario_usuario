package com.protalento.entidad;

public class User_login {    //Business Object
    private String id;
    private String usuario;

    public User_login() {
    }

    public User_login(String id, String usuario) {
        this.id = id;
        this.usuario = usuario;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        return "User_login{" +
                "clave='" + id + '\'' +
                ", usuario='" + usuario + '\'' +
                '}';
    }
}
