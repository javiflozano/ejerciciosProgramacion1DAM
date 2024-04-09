package com.iessanalberto.dam1.mkdonalds;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.time.LocalDate;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        LocalDate fecha = LocalDate.now();
        System.out.println(fecha.lengthOfMonth());


        MenuScreen menuScreen = new MenuScreen();
        SecondScreen secondScreen = new SecondScreen();
        Scene scene = new Scene(menuScreen.root, 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);

        Scene scene2 = new Scene(secondScreen.root,320,400);
        menuScreen.btnNavegar.setOnAction(actionEvent -> stage.setScene(scene2));

        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}