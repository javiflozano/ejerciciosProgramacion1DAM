package com.iessanalberto.dam1.pokemon;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        GameScreen gameScreen = new GameScreen();
        gameScreen.startGame();

        Scene scene = new Scene(gameScreen.root,600,350);
        stage.setTitle("Pokemon");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}