package com.iessanalberto.dam1.javiflozano.javabattle;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        // Declaramos los objetos de mi ventana
        Label lblNombre = new Label("Player");
        Label lblAtaque = new Label("Ataque: ");
        Label lblDefensa = new Label("Defensa");
        Label lblPuntosVida = new Label("Puntos de vida");
        Label lblNombreEnemy = new Label("Enemy");
        Label lblAtaqueEnemy = new Label("Ataque: ");
        Label lblDefensaEnemy = new Label("Defensa");
        Label lblPuntosVidaEnemy = new Label("Puntos de vida");
        TextField txtNombre = new TextField();
        TextField txtAtaque = new TextField();
        TextField txtDefensa = new TextField();
        TextField txtPuntosVida = new TextField();
        TextField txtNombreEnemy = new TextField();
        TextField txtAtaqueEnemy = new TextField();
        TextField txtDefensaEnemy = new TextField();
        TextField txtPuntosVidaEnemy = new TextField();
        Button btnAtacar = new Button("Atacar!");
        // Añadimos los elementos por filas
        HBox fila1 = new HBox();
        HBox fila2 = new HBox();
        HBox fila3 = new HBox();
        HBox fila4 = new HBox();
        fila1.setPadding(new Insets(5));
        fila2.setPadding(new Insets(5));
        fila3.setPadding(new Insets(5));
        fila4.setPadding(new Insets(5));
        fila1.setSpacing(10);
        fila2.setSpacing(10);
        fila3.setSpacing(10);
        fila4.setSpacing(10);

        fila1.getChildren().addAll(lblNombre,txtNombre,lblNombreEnemy,txtNombreEnemy);
        fila2.getChildren().addAll(lblAtaque,txtAtaque,lblAtaqueEnemy,txtAtaqueEnemy);
        fila3.getChildren().addAll(lblDefensa,txtDefensa,lblDefensaEnemy,txtDefensaEnemy);
        fila4.getChildren().addAll(lblPuntosVida,txtPuntosVida,lblPuntosVidaEnemy,txtPuntosVidaEnemy);
        // Organizamos la ventana principal
        VBox root = new VBox();
        root.setAlignment(Pos.CENTER_LEFT);
        root.getChildren().addAll(fila1,fila2,fila3,fila4,btnAtacar);
        root.setSpacing(10);
        Scene scene = new Scene(root,640,480);
        stage.setTitle("Java Battle");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}