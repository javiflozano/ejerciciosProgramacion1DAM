package com.iessanalberto.dam1.mkdonalds;

import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class SecondScreen {
    VBox root = new VBox();
    Label lblHola = new Label("Hola mundo");
    public SecondScreen(){
        root.getChildren().add(lblHola);
    }
}
