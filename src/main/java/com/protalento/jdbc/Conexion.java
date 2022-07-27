package com.protalento.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    public Connection getConexion() {
        Connection connection = null;
        String db_driver = "org.mariadb.jdbc.Driver";
        String db_url = "jdbc:mariadb://localhost:3306/usuario_jsp";
        String db_user = "root";
        String db_clave ="";
        try {
            Class.forName(db_driver);
            connection = DriverManager.getConnection(db_url,db_user,db_clave);
            System.out.println("conecion ok");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }


        return connection;

    }



}
