package com.protalento.ImplementarUsuario;

import com.protalento.entidad.User_login;
import com.protalento.entidad.Usuario_formulario;
import com.protalento.interfaces_jdbc.DAO;

public class ImpUsuario implements DAO<Usuario_formulario,String> {


    @Override
    public User_login buscar(String s) {
        String sql="";

        return null;
    }

    @Override
    public boolean insertar(Usuario_formulario usuario_formulario) {
        String sql="";
        return false;
    }

    @Override
    public boolean modifica(Usuario_formulario usuario_formulario) {
        String sql="";
     return false;
    }

    @Override
    public boolean eliminar(Usuario_formulario usuario_formulario) {
        String sql="";
        return false;

    }
}
