package com.iessanalberto.dam1.jdbc.screens;

import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class ClienteScreen {
    public VBox root = new VBox();
    Label lblHola = new Label("Hola mundo");

    public ClienteScreen() {
        root.getChildren().add(lblHola);
    }
}
