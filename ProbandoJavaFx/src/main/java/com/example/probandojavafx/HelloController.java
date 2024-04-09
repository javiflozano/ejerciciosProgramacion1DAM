package com.example.probandojavafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {

    private int numeroSecreto = (int) (Math.random()*11);

    @FXML
    private TextField txtNumero;

    @FXML
    private Label lblResultado;

    @FXML
    private Button btnComprobar;

    @FXML
    protected void onBtnComprobar(ActionEvent actionEvent) {
        if (numeroSecreto == Integer.parseInt(txtNumero.getText())){
            lblResultado.setText("Has ganado");
            btnComprobar.setDisable(true);
        } else lblResultado.setText("Ese no es el número");
    }
}