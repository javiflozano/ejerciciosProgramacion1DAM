package com.iessanalberto.dam1.javiflozano.holamundojavafx;

import com.iessanalberto.dam1.javiflozano.holamundojavafx.clases.Personaje;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
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
        // Declaraciones de objetos
        Personaje player = new Personaje();
        Personaje enemy = new Personaje();

        // Declaramos los objetos de mi ventana
        Label lblNombre = new Label("Nombre");
        Label lblAtaque = new Label("Ataque: ");
        Label lblDefensa = new Label("Defensa");
        Label lblPuntosVida = new Label("Puntos de vida");
        Label lblNombreEnemy = new Label("Nombre");
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
        Button btnGenerar = new Button("Generar jugador");
        Label lblResultado = new Label();
        // Añadimos los elementos por filas
        HBox fila1 = new HBox();
        HBox fila2 = new HBox();
        HBox fila3 = new HBox();
        HBox fila4 = new HBox();
        HBox fila5 = new HBox();
        fila1.getChildren().addAll(lblNombre,txtNombre,lblNombreEnemy,txtNombreEnemy);
        fila2.getChildren().addAll(lblAtaque,txtAtaque,lblAtaqueEnemy,txtAtaqueEnemy);
        fila3.getChildren().addAll(lblDefensa,txtDefensa,lblDefensaEnemy,txtDefensaEnemy);
        fila4.getChildren().addAll(lblPuntosVida,txtPuntosVida,lblPuntosVidaEnemy,txtPuntosVidaEnemy);
        fila5.getChildren().addAll(btnGenerar,btnAtacar);
        fila5.setSpacing(30);
        // Organizamos la ventana principal
        VBox root = new VBox();

        root.getChildren().addAll(fila1,fila2,fila3,fila4,fila5,lblResultado);
        root.setAlignment(Pos.CENTER);
        root.setSpacing(10);
        Scene scene = new Scene(root,500,340);
        stage.setTitle("Java Battle");
        stage.setScene(scene);
        stage.show();
        //Lógica de los botones
        btnGenerar.setOnAction(actionEvent -> {
            player.setNombre(txtNombre.getText());
            player.setAtaque(Integer.parseInt(txtAtaque.getText()));
            player.setDefensa(Integer.parseInt(txtDefensa.getText()));
            player.setPuntosVida(Integer.parseInt(txtPuntosVida.getText()));
            txtNombreEnemy.setText(enemy.getNombre());
            txtAtaqueEnemy.setText(String.valueOf(enemy.getAtaque()));
            txtDefensaEnemy.setText(String.valueOf(enemy.getDefensa()));
            txtPuntosVidaEnemy.setText(String.valueOf(enemy.getPuntosVida()));
        });

        btnAtacar.setOnAction(actionEvent -> {
            if (player.atacar(enemy)){
                int puntos = Integer.parseInt(txtPuntosVidaEnemy.getText());
                puntos -= 10;
                if (puntos <= 0){
                    Alert result = new Alert(Alert.AlertType.INFORMATION);
                    result.setTitle("Victoria!");
                    result.setHeaderText("Venciste al enemigo");
                    result.setContentText(player.getNombre() +" ha vencido a " + enemy.getNombre());
                    result.showAndWait();
                } else {
                    txtPuntosVidaEnemy.setText(String.valueOf(puntos));
                    lblResultado.setText("Tú ganas");
                }
            } else {
                player.setPuntosVida(player.getPuntosVida() - 5);
                txtPuntosVida.setText(String.valueOf(player.getPuntosVida()));
                lblResultado.setText("Tú pierdes");
            }

        });

    }



    public static void main(String[] args) {
        launch();
    }
}