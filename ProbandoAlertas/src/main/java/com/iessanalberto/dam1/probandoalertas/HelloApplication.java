package com.iessanalberto.dam1.probandoalertas;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextInputDialog;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Optional;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        VBox root = new VBox();
        Button btnAlerta = new Button("Pulsar");

        Button btnInputDialog = new Button("Pulsar!!!");

        btnAlerta.setOnAction(actionEvent -> mostrarAlerta());
        btnInputDialog.setOnAction(actionEvent -> mostrarInputDialog());
        root.getChildren().addAll(btnAlerta,btnInputDialog);

        Scene scene = new Scene(root, 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    private void mostrarInputDialog() {
        TextInputDialog txtDialog = new TextInputDialog();
        txtDialog.setTitle("Esto es el título");
        txtDialog.setHeaderText("Esto es el header text");
        txtDialog.setContentText("Esto es el content Text");
        Optional<String> textoDialogo = txtDialog.showAndWait();
        System.out.println("Has escrito: " + textoDialogo.get());

    }

    private void mostrarAlerta() {
        Alert alerta = new Alert(Alert.AlertType.CONFIRMATION);
        alerta.setHeaderText("Esto es el Header Text");
        alerta.setTitle("Esto es el título");
        alerta.setContentText("Esto es el content text");
        Optional<ButtonType> action = alerta.showAndWait();
        if (action.get() == ButtonType.OK){
            System.out.println("Has pulsado Ok");
        } else if (action.get() == ButtonType.CANCEL){
            System.out.println("Has pulsado Cancel");
        }

    }

    public static void main(String[] args) {
        launch();
    }
}