package com.iessanalberto.dam1.probandotablasjavafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FirstScreen firstScreen = new FirstScreen();
        firstScreen.loadTabla();
        // Añadimos las columnas a la tabla
        // Añadir las columnas;


        Scene scene = new Scene(firstScreen.root, 320, 240);
        stage.setTitle("Probando tablas");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}