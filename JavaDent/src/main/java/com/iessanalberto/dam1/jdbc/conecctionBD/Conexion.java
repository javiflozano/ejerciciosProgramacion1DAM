package com.iessanalberto.dam1.jdbc.conecctionBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    String url = "jdbc:mysql://localhost:3307/Borrame1?serverTimeZone=UTC";
    String username = "root";
    String password = "root";
    Connection connection;

    public Conexion() throws SQLException {
        connection = DriverManager.getConnection(url,username,password);
    }
}
