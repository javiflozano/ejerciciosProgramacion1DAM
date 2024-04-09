package com.iessanalberto.dam1.probandotablas;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        TablaScreen tablaScreen = new TablaScreen();
        Persona persona1 = new Persona("Paco", "Pérez", "C/ Autonomía de Navarra 27, 4ºA");
        Persona persona2 = new Persona("Ana", "Gómez", "Plaza España 4, sn");
        Persona persona3 = new Persona("Pedro", "Álvarez", "C/ Mayor 123, 6ºB");
        Persona persona4 = new Persona("Ana", "Álvarez", "C/ Mayor 123, 6ºB");
        ArrayList<Persona> listaPersonas = new ArrayList<>();
        listaPersonas.add(persona1);
        listaPersonas.add(persona2);
        listaPersonas.add(persona3);
        listaPersonas.add(persona4);

        tablaScreen.tablaPersonas.getItems().addAll(persona1, persona3, persona2, persona4);
        // Definimos la acción del botón
        tablaScreen.btnBuscar.setOnAction(
                actionEvent -> {
                    tablaScreen.tablaPersonas.getItems().clear();
                    for (Persona persona : listaPersonas) {
                        if (persona.nombre.equals(tablaScreen.txtNombre.getText())) {
                            tablaScreen.tablaPersonas.getItems().add(persona);
                        }
                    }
                });

        Scene scene = new Scene(tablaScreen.root, 400, 400);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}