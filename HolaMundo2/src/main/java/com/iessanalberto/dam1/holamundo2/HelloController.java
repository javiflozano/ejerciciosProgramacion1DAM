package com.iessanalberto.dam1.holamundo2;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {


    @FXML
    private Label saludo;

    @FXML
    protected void onHola(){
        saludo.setText("Hola Jaca!!");
    }

}