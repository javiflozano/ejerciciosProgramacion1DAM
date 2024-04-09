package com.iessanalberto.dam1.pokemon;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {

    @FXML
    TextField ataque;

    private int ataqueMio = Integer.parseInt(ataque.getText());


    @FXML
    protected void onHelloButtonClick() {

    }
}