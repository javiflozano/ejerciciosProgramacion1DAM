package com.iessanalberto.dam1.jdbc;

import java.util.ArrayList;
import java.util.Random;

public class Ahorcado {
    private String [] listaPalabras = {
            "gato",
            "perro",
            "elefante",
            "jirafa",
            "tigre",
            "leon",
            "oso",
            "mono",
            "cebra",
            "pajaro"
    };
    private  String secretWord;
    private  String wordAttempt;
    public Ahorcado(){
        secretWord =  listaPalabras[new Random().nextInt(listaPalabras.length)];
        wordAttempt = "_".repeat(secretWord.length());
    }

    public String getSecretWord() {
        return secretWord;
    }

    public String getWordAttempt() {
        return wordAttempt;
    }

    public  boolean comprobarPalabra(char playerChar){
        boolean isCharPresent = false;
        for (int indice = 0; indice < secretWord.length(); indice ++){
            if (secretWord.charAt(indice) == playerChar){
                wordAttempt = wordAttempt.substring(0,indice) + playerChar + wordAttempt.substring(indice+1);
                isCharPresent = true;
            }
        }
        return isCharPresent;
    }
    public String wordAttemptToShow(){
        String [] caracteres = wordAttempt.split("");
        return String.join(" ",caracteres);
    }
}
