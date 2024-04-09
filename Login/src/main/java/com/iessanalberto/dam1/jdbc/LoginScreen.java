package com.iessanalberto.dam1.jdbc;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

import java.sql.ResultSet;

public class LoginScreen {
    // Definimos los elementos de layout
    VBox root = new VBox();
    HBox fila1 = new HBox();
    HBox fila2 = new HBox();
    // Definimos los componentes de la ventana de Login

    // Fila 1
    Label lblUser = new Label("Usuario");
    TextField txtUser = new TextField();
    // Fila 2
    Label lblPassword = new Label("Contraseña");
    TextField txtPassword = new TextField();
    // Botón de conectar (sin fila)
    Button btnConectar = new Button("Conectar");

    public LoginScreen() {
        // Definimos los parámetros de los elementos de layout
        root.setSpacing(20);
        root.setAlignment(Pos.CENTER);
        fila1.setSpacing(10);
        fila1.setAlignment(Pos.CENTER);
        fila2.setSpacing(10);
        fila2.setAlignment(Pos.CENTER);
        // Añadimos los elementos al layout correspondiente
        fila1.getChildren().addAll(lblUser,txtUser);
        fila2.getChildren().addAll(lblPassword,txtPassword);
        root.getChildren().addAll(fila1,fila2,btnConectar);
        // Añadimos la interactividad al botón
        btnConectar.setOnAction(actionEvent -> {login();});
    }

    private void login() {
        Conexion conexion = new Conexion();
        if (conexion.login(txtUser.getText(),txtPassword.getText())){
            System.out.println("Conectado");
        } else {
            System.out.println("Error");
        }
        conexion.desConexion();
    }
}
