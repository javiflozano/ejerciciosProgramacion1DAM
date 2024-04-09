package com.example.probandojavafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        VBox root = new VBox();
        root.setAlignment(Pos.CENTER);
        HBox fila1 = new HBox();
        fila1.setAlignment(Pos.CENTER);
        fila1.setSpacing(30);

        Label lblHolaMundo = new Label("Hola mundo");
        lblHolaMundo.setFont(Font.font("Verdana",FontWeight.BLACK,20));
        TextField nombre = new TextField();
        nombre.setPrefWidth(30);


        fila1.getChildren().addAll(lblHolaMundo,nombre);
        root.getChildren().addAll(fila1);

        //FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(root, 420, 440);
        stage.setTitle("Mi primer GUI");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}