package com.iessanalberto.dam1.jdbc;

import com.iessanalberto.dam1.jdbc.conecctionBD.Conexion;
import com.iessanalberto.dam1.jdbc.screens.ClienteScreen;
import com.iessanalberto.dam1.jdbc.screens.FirstScreen;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FirstScreen firstScreen = new FirstScreen();
        ClienteScreen clienteScreen = new ClienteScreen();


        Scene scene = new Scene(firstScreen.root, 420, 340);
        stage.setTitle("JavaDent");
        stage.setScene(scene);
        stage.show();

        firstScreen.btnClientes.setOnAction(actionEvent -> {
            Scene scene1 = new Scene(clienteScreen.root,420,340);
            stage.setScene(scene1);
        });

    }

    public static void main(String[] args) {
        launch();
    }
}