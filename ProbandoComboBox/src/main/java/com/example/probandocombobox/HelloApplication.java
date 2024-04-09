package com.example.probandocombobox;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Optional;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        VBox root = new VBox();
        root.setAlignment(Pos.CENTER);
        ObservableList<String> listaCafes = FXCollections.observableArrayList();
        listaCafes.addAll("Café con leche", "Cortado", "Café solo");
        ComboBox<String> comboCafes = new ComboBox<>(listaCafes);
        comboCafes.setValue("Elige café");
        Button btnPedir = new Button("Pedir");
        btnPedir.setOnAction(ActionEvent -> pedir(comboCafes.getValue()));
        root.getChildren().addAll(comboCafes,btnPedir);

        VBox otroRoot = new VBox();
        Label lblFinal = new Label("Otro lado");

        Scene scene = new Scene(root, 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    private void pedir(String cafe) {
        Alert confirmacion = new Alert(Alert.AlertType.CONFIRMATION);
        confirmacion.setHeaderText("Vas a pedir un: " + cafe);
        confirmacion.setTitle("Bar don Manolo");
        confirmacion.setContentText("¿Desea confirmar la comanda");
        Optional<ButtonType> btnConfirmacion = confirmacion.showAndWait();
        if (btnConfirmacion.get() == ButtonType.OK){
            System.out.println(cafe);
        }

    }


    public static void main(String[] args) {
        launch();
    }
}