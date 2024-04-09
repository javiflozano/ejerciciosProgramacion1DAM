package com.iessanalberto.dam1.jdbc;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Conexion {
    String url = "jdbc:mysql://localhost:3307/Personas?serverTimezone=UTC";
    String username = "root";
    String passBD = "root";
    Connection connection;

    PreparedStatement loginStatement;

    public Conexion() {
        try {
            connection = DriverManager.getConnection(url,username,passBD);
        } catch (Exception exception){
            exception.printStackTrace();
        }
    }

    public boolean login(String usuario, String password){
        try {
            loginStatement = connection.prepareStatement("SELECT * FROM usuarios where usuario = ? and password = ?");
            loginStatement.setString(1,usuario);
            loginStatement.setString(2,password);
            ResultSet resultSet = loginStatement.executeQuery();
            return resultSet.next();
        } catch (Exception exception){
            exception.printStackTrace();
        }
        return false;
    }
    public void desConexion(){
        try {
            connection.close();
            loginStatement.close();
        }catch (Exception exception){
            exception.printStackTrace();
        }


    }
}
