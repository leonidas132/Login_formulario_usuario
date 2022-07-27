package com.protalento.ImplementarUsuario;

import com.protalento.entidad.User_login;
import com.protalento.interfaces_jdbc.DAO;
import com.protalento.jdbc.Conexion;
import org.w3c.dom.ls.LSOutput;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class ImpUser_login implements DAO<User_login,String > {

    private PreparedStatement preparedStatementBuscar;
    private PreparedStatement preparedStatementInsertar;
    private PreparedStatement preparedStatementModificar;
    private PreparedStatement preparedStatementEliminar;
    private PreparedStatement preparedStatementValidar;
    private Conexion conexion ;

    public ImpUser_login() {
        conexion =new Conexion();
    }

    @Override
    public User_login buscar(String id) {
        User_login user_login = null;

        String sql = "select usuario from credenciales where id= ?";
        try {
            if(null == preparedStatementBuscar) {
                preparedStatementBuscar =conexion.getConexion().prepareStatement(sql);
            }
            preparedStatementBuscar.setString(1,id);
            ResultSet resultSet =preparedStatementBuscar.executeQuery();

            if (resultSet.next()){
                user_login = new User_login();
                user_login.setId(id);
                user_login.setUsuario(resultSet.getString("usuario"));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return user_login;
    }

    @Override
    public boolean insertar(User_login user_login) {
        String sql = "insert into credenciales(id,usuario) values(?,?)";
        try {
            if(null== preparedStatementInsertar){
                preparedStatementInsertar = conexion.getConexion().prepareStatement(sql);
            }
            preparedStatementInsertar.setString(1,user_login.getId());
            preparedStatementInsertar.setString(2,user_login.getUsuario());
            return preparedStatementInsertar.executeUpdate()==1;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public boolean modifica(User_login user_login) {
        String sql = "update credenciales set usuario = ? where  id=?";
        try {
            if(null==preparedStatementModificar){
                preparedStatementModificar = conexion.getConexion().prepareStatement(sql);
            }
            preparedStatementModificar.setString(1,user_login.getUsuario());
            preparedStatementModificar.setString(2,user_login.getId());

            return preparedStatementModificar.executeUpdate() == 1;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public boolean eliminar(User_login user_login) {
        String sql = "delete from credenciales where id =?";
        try {
            if(null== preparedStatementEliminar) {
                preparedStatementEliminar = conexion.getConexion().prepareStatement(sql);
            }
            preparedStatementEliminar.setString(1,user_login.getId());

            return preparedStatementEliminar.executeUpdate() == 1;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

     int r = 0;
    public int Validar(User_login user_login) {
        User_login user_login1 =null;
        String sql = "select * from  credenciales where id = ? and usuario =?";
        try {
            if (null == preparedStatementValidar) {
                preparedStatementValidar = conexion.getConexion().prepareStatement(sql);
            }
            preparedStatementValidar.setString(1,user_login.getId());
            preparedStatementValidar.setString(2,user_login.getUsuario());

            ResultSet resultSet = preparedStatementValidar.executeQuery();
            if (resultSet.next()){
                r = r + 1;
                user_login1 = new User_login();
                user_login1.setId(resultSet.getString("id"));
                user_login1.setUsuario(resultSet.getString("usuario"));

            }
            if (r == 1){
                return 1;
            }else{
                return 0;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public boolean Validar(String id,String usuario){
        User_login user_login1 =null;
        String sql = "select * from  credenciales where id = ? and usuario =?";
        try {
            if (null == preparedStatementValidar) {
                preparedStatementValidar = conexion.getConexion().prepareStatement(sql);
            }
            preparedStatementValidar.setString(1,id);
            preparedStatementValidar.setString(2,usuario);

            ResultSet resultSet = preparedStatementValidar.executeQuery();
            if (resultSet.absolute(1)){
               return true;

            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return false;
    }

    public static void main(String[] args) {
        ImpUser_login impUser_login = new ImpUser_login();
       // System.out.println(impUser_login.buscar("12"));
     //   User_login userLogin = new User_login("02","user02");
         //impUser_login.insertar(userLogin);
       // impUser_login.modifica(userLogin);
        System.out.println(impUser_login.Validar("02","user02"));

    }
}
