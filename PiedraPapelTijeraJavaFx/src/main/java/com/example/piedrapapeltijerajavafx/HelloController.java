package com.example.piedrapapeltijerajavafx;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class HelloController {
    private Map<Integer,String> mapaJugadas = new HashMap<>();

    @FXML
    private TextField txtJugadaPlayer;

    @FXML
    private Label lblResultado;

    @FXML
    protected void onJugarButtonClick() {
        cargar(mapaJugadas);
        int jugadaMaquina = (int) (Math.random()*3+1);
        int jugadaPlayer = 0;
        for (Map.Entry<Integer,String> jugada: mapaJugadas.entrySet()){
            if (jugada.getValue().equals(txtJugadaPlayer.getText())){
                jugadaPlayer = jugada.getKey();
            }
        }
        String resultado = "Tú elegiste " + mapaJugadas.get(jugadaPlayer) + ". Yo he sacado " + mapaJugadas.get(jugadaMaquina);
        switch (jugadaPlayer - jugadaMaquina){
            case 1, -2 -> lblResultado.setText(resultado + ". Tú ganas" );
            case 0 -> lblResultado.setText(resultado + ". Empate");
            default -> lblResultado.setText(resultado + ". Yo gano");
        }

    }

    public void cargar(Map<Integer,String> mapaJugadas){
        mapaJugadas.put(3,"Piedra");
        mapaJugadas.put(2,"Tijera");
        mapaJugadas.put(1,"Papel");
    }
}