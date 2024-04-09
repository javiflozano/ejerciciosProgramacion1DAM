package com.iessanalberto.dam1.holamundo2.screens;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class FirstScreen {
    // Definimos todos los objetos que forman mi ventana
    VBox root = new VBox();
    Label saludo = new Label("Hola Sabi");
    Button miBoton = new Button("Púlsame!");

    public FirstScreen() {
        root.setAlignment(Pos.CENTER);
        root.getChildren().addAll(saludo,miBoton);
        miBoton.setOnAction(
                actionEvent -> {saludo.setText("Hola Jaca");}
        );
    }

    public VBox getRoot() {
        return root;
    }
}
