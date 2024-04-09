package com.iessanalberto.dam1.loteria;

import com.iessanalberto.dam1.loteria.models.Persona;
import com.iessanalberto.dam1.loteria.models.Sorteo;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
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
        // Declaramos los Layout
        VBox root = new VBox();
        HBox fila1 = new HBox();
        HBox fila2 = new HBox();
        HBox fila3 = new HBox();
        HBox fila4 = new HBox();
        // Declaramos los objetos de la vista
        Label lblSorteo = new Label("Sorteo de Navidad");
        Label lblGordo = new Label("Premio Gordo: ");
        Label lblSegundo = new Label("Segundo premio: ");
        Label lblTercero = new Label("Tercer premio: ");
        Label lblCuartos = new Label("Cuarto premio: ");
        Label lblQuintos = new Label("Quinto premio: ");
        Label lblIntroDecimo = new Label("Introduce número de décimos a jugar: ");
        Label lblResultado = new Label("");
        TextField txtGordo = new TextField();
        TextField txtSegundo = new TextField();
        TextField txtTercero = new TextField();
        TextField txtCuarto1 = new TextField();
        TextField txtCuarto2 = new TextField();
        TextField txtQuinto1 = new TextField();
        TextField txtQuinto2 = new TextField();
        TextField txtQuinto3 = new TextField();
        TextField txtQuinto4 = new TextField();
        TextField txtQuinto5 = new TextField();
        TextField txtQuinto6 = new TextField();
        TextField txtQuinto7 = new TextField();
        TextField txtQuinto8 = new TextField();
        TextField txtDecimo = new TextField();
        txtGordo.setPrefSize(50,0);
        txtSegundo.setPrefSize(50,0);
        txtTercero.setPrefSize(50,0);
        txtCuarto1.setPrefSize(50,0);
        txtCuarto2.setPrefSize(50,0);
        txtQuinto1.setPrefSize(50,0);
        txtQuinto2.setPrefSize(50,0);
        txtQuinto2.setPrefSize(50,0);
        txtQuinto3.setPrefSize(50,0);
        txtQuinto4.setPrefSize(50,0);
        txtQuinto5.setPrefSize(50,0);
        txtQuinto6.setPrefSize(50,0);
        txtQuinto7.setPrefSize(50,0);
        txtQuinto8.setPrefSize(50,0);


        Button btnJugar = new Button("Jugar");

        // Asignamos los objetos a su layout correspondiente
        fila1.getChildren().addAll(lblGordo,txtGordo,lblSegundo,txtSegundo,lblTercero,txtTercero);
        fila2.getChildren().addAll(lblCuartos,txtCuarto1,txtCuarto2);
        fila3.getChildren().addAll(lblQuintos,txtQuinto1,txtQuinto2,txtQuinto3,txtQuinto4,txtQuinto5,txtQuinto6,txtQuinto7,txtQuinto8);
        fila4.getChildren().addAll(lblIntroDecimo,txtDecimo);

        root.getChildren().addAll(lblSorteo,fila1,fila2,fila3,fila4,btnJugar,lblResultado);
        root.setSpacing(20);
        fila1.setSpacing(10);
        fila2.setSpacing(10);
        fila3.setSpacing(10);
        fila4.setSpacing(10);

        Scene scene = new Scene(root, 1200, 640);
        stage.setTitle("Lotería de Navidad");
        stage.setScene(scene);
        stage.show();

        Sorteo sorteo = new Sorteo();
        txtGordo.setText(String.valueOf(sorteo.getGordo()));
        txtSegundo.setText(String.valueOf(sorteo.getSegundo()));
        txtTercero.setText(String.valueOf(sorteo.getTercero()));
        txtCuarto1.setText(String.valueOf(sorteo.getCuartos()[0]));
        txtCuarto2.setText(String.valueOf(sorteo.getCuartos()[1]));
        txtQuinto1.setText(String.valueOf(sorteo.getQuintos()[0]));
        txtQuinto2.setText(String.valueOf(sorteo.getQuintos()[1]));
        txtQuinto3.setText(String.valueOf(sorteo.getQuintos()[2]));
        txtQuinto4.setText(String.valueOf(sorteo.getQuintos()[3]));
        txtQuinto5.setText(String.valueOf(sorteo.getQuintos()[4]));
        txtQuinto6.setText(String.valueOf(sorteo.getQuintos()[5]));
        txtQuinto7.setText(String.valueOf(sorteo.getQuintos()[6]));
        txtQuinto8.setText(String.valueOf(sorteo.getQuintos()[7]));

        btnJugar.setOnAction(actionEvent -> {
            int importeGanado = 0;
            for (int contador = 0;contador < Integer.parseInt(txtDecimo.getText());contador++){
                importeGanado += sorteo.comprobarDecimo((int) (Math.random()*100000));

            }
            lblResultado.setText("Has jugado " + Integer.parseInt(txtDecimo.getText())*20 + "€, has ganado " + importeGanado);
        });

    }

    public static void main(String[] args) {

        launch();

    }
}