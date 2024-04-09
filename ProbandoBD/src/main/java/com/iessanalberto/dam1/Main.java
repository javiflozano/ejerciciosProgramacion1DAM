package com.iessanalberto.dam1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3307/Borrame?serverTimezone=UTC";
        String username = "root";
        String password = "root";

        try {
            Connection connection = DriverManager.getConnection(url,username,password);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM Alumnos");
            while (resultSet.next()){
                System.out.println(resultSet.getString("Nombre"));
            }
            connection.close();
            statement.close();
            resultSet.close();


        } catch (Exception exception){
            exception.printStackTrace();
        }
    }
}