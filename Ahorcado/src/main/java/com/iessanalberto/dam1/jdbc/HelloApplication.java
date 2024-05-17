package com.iessanalberto.dam1.jdbc;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        GameScreen gameScreen = new GameScreen();
        Scene scene = new Scene(gameScreen.root, 480, 600);
        stage.setTitle("Ahorcado!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}