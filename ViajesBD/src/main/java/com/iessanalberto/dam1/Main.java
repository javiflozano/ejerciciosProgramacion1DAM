package com.iessanalberto.dam1;

import java.sql.*;

public class Main {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3307/Viajes?serverTimeZone=UTC";
        String username = "root";
        String password = "root";
        try {
            Connection connection = DriverManager.getConnection(url,username,password);

            PreparedStatement preparedStatement = connection.prepareStatement(
                    "SELECT * FROM Autobuses where Origen = ?  AND Destino = ?"
            );
            preparedStatement.setString(1,"Huesca");
            preparedStatement.setString(2,"Sabi");
            ResultSet resultSet2 = preparedStatement.executeQuery();
            //Statement statement = connection.createStatement();
            //ResultSet resultSet = statement.executeQuery("SELECT * from Autobuses");

            while (resultSet2.next()){
                System.out.println("Salida: ");
                System.out.println(resultSet2.getString("Origen"));
                System.out.println("Llegada: " + resultSet2.getString("Destino"));
            }

            connection.close();
            preparedStatement.close();
            resultSet2.close();
        } catch (Exception exception){
            exception.printStackTrace();
        }


    }
}