package com.protalento.ImplementarUsuario;

import com.protalento.entidad.Documento;
import com.protalento.entidad.User_login;
import com.protalento.entidad.Usuario_formulario;
import com.protalento.interfaces_jdbc.DAO;
import com.protalento.jdbc.Conexion;
import com.protalento.utilidades.Fechas;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ImpUsuario implements DAO<Usuario_formulario,String> {
    private PreparedStatement preparedStatementBuscar;
    private PreparedStatement preparedStatementInsertar;
    private PreparedStatement preparedStatementModificar;
    private PreparedStatement preparedStatementEliminar;
    private PreparedStatement preparedStatementListar;
    private Conexion conexion;

    public ImpUsuario() {
       conexion =new Conexion();
    }

    @Override
    public Usuario_formulario buscar(String id) {
        Usuario_formulario formulario =null;

        String sql="select numeroDoc, tipoDoc,nombre,apellido,FechaNacimiento from formulario where id=?";
        try {
            if (null == preparedStatementBuscar) {  // solo entrara si la consulta esta en null de lo contrario ejecutara el query
                preparedStatementBuscar = conexion.getConexion().prepareStatement(sql);
            }
            preparedStatementBuscar.setString(1,id);
            ResultSet resultSet= preparedStatementBuscar.executeQuery();
            if (resultSet.next()){

                formulario = new Usuario_formulario();
                formulario.setId(id);
                formulario.setNumeroDoc(resultSet.getString("numeroDoc"));
                formulario.setTipoDoc(resultSet.getString("tipoDoc"));
                formulario.setNombre(resultSet.getString("nombre"));
                formulario.setApellido(resultSet.getString("apellido"));
                formulario.setFechaNacimiento(Fechas.getLocalDate(resultSet.getString("fechaNacimiento")));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return formulario;
    }

    @Override
    public boolean insertar(Usuario_formulario usuario_formulario) {
        String sql="insert into formulario(id,numeroDoc,tipoDoc,nombre,apellido,fechaNacimiento) values(?,?,?,?,?,?)";
        try {
            if(null ==preparedStatementInsertar){
                preparedStatementInsertar = conexion.getConexion().prepareStatement(sql);
            }
            preparedStatementInsertar.setString(1,usuario_formulario.getId());
            preparedStatementInsertar.setString(2,usuario_formulario.getNumeroDoc());
            preparedStatementInsertar.setString(3,usuario_formulario.getTipoDoc());
            preparedStatementInsertar.setString(4,usuario_formulario.getNombre());
            preparedStatementInsertar.setString(5,usuario_formulario.getApellido());
            preparedStatementInsertar.setString(6,Fechas.getString(usuario_formulario.getFechaNacimiento()));
            System.out.println("is correct");
            return preparedStatementInsertar.executeUpdate()==1;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public boolean modifica(Usuario_formulario usuario_formulario) {
        String sql=" update formulario set nombre, apellido  where id =?";
        try {
            if(null == preparedStatementModificar) {
                preparedStatementModificar = conexion.getConexion().prepareStatement(sql);
            }
            preparedStatementModificar.setString(1,usuario_formulario.getNombre());
            preparedStatementModificar.setString(2,usuario_formulario.getApellido());
            preparedStatementModificar.setString(3,usuario_formulario.getId());
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return false;
    }

    @Override
    public boolean eliminar(Usuario_formulario usuario_formulario) {
        String sql="delete from formulario where id = ?";
        try{
            if (null== preparedStatementEliminar){
                preparedStatementEliminar = conexion.getConexion().prepareStatement(sql);
            }
            preparedStatementEliminar.setString(1,usuario_formulario.getId());

            System.out.println("delete ok");
            return preparedStatementEliminar.executeUpdate() == 1;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public List<Usuario_formulario> listar(){
        List<Usuario_formulario> listas = new ArrayList<>();
        String sql = "Select nombre,apellido,tipoDoc, numeroDoc from formulario";
        try {
            if(null == preparedStatementListar) {
                preparedStatementListar = conexion.getConexion().prepareStatement(sql);
            }
            ResultSet resultSet = preparedStatementListar.executeQuery();
            while (resultSet.next()){
                Usuario_formulario usuario_formulario = new Usuario_formulario();
                usuario_formulario.setNombre(resultSet.getString("nombre"));
                usuario_formulario.setApellido(resultSet.getString("apellido"));
                usuario_formulario.setTipoDoc(resultSet.getString("tipoDoc"));
                usuario_formulario.setNumeroDoc(resultSet.getString("numeroDoc"));
                //agregar a la lista
                listas.add(usuario_formulario);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


        return listas;
    }
    public static void main(String[] args) {

        ImpUsuario impUsuario= new ImpUsuario();
        Usuario_formulario usuario = new Usuario_formulario("01","1245f","CI","MARIA","MORALES",Fechas.getLocalDate("2022-10-05"));
        impUsuario.insertar(usuario);


       // System.out.println(impUsuario.eliminar(usuario));
        System.out.println(impUsuario.listar());





    }
}
