package com.example.numbers;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        VBox root = new VBox();
        root.setPadding(new Insets(10,50,50,50));
        root.setSpacing(20);
        HBox fila1 = new HBox();
        HBox fila2 = new HBox();
        HBox fila3 = new HBox();
        HBox fila4 = new HBox();
        HBox fila5 = new HBox();
        fila1.setSpacing(20);
        fila2.setSpacing(20);
        fila3.setSpacing(20);
        fila4.setSpacing(20);
        fila5.setSpacing(20);

        Label titulo = new Label("Acierta el número secreto");
        // Fila 1
        TextField number1 = new TextField();
        TextField number2 = new TextField();
        TextField number3 = new TextField();
        TextField number4 = new TextField();
        // Fila 2
        TextField number5 = new TextField();
        TextField number6 = new TextField();
        TextField number7 = new TextField();
        TextField number8 = new TextField();
        // Ajustamos tamaño de los números
        number1.setPrefWidth(40);
        number2.setPrefWidth(40);
        number3.setPrefWidth(40);
        number4.setPrefWidth(40);
        number5.setPrefWidth(40);
        number6.setPrefWidth(40);
        number7.setPrefWidth(40);
        number8.setPrefWidth(40);
        // Fila 3
        Label adivina = new Label("Número objetivo: ");
        TextField numberObjetivo = new TextField();
        numberObjetivo.setPrefWidth(40);
        numberObjetivo.setDisable(true);
        // Fila 4
        Label num1 = new Label("Num 1");
        Label ope = new Label("Operation");
        Label num2 = new Label("Num 2");

        // Fila 5
        TextField numberUser1 = new TextField();
        TextField operacion = new TextField();
        TextField numberUser2 = new TextField();
        numberUser1.setPrefWidth(40);
        numberUser2.setPrefWidth(40);
        operacion.setPrefWidth(40);
        Button btnJugar = new Button("Operar");


        // Añadimos los elementos a su layout correspondiente
        fila1.getChildren().addAll(number1,number2,number3,number4);
        fila2.getChildren().addAll(number5,number6,number7,number8);
        fila3.getChildren().addAll(adivina,numberObjetivo);
        fila4.getChildren().addAll(num1,ope,num2);
        fila5.getChildren().addAll(numberUser1,operacion,numberUser2,btnJugar);
        root.getChildren().addAll(titulo,fila1,fila2,fila3,fila4,fila5);

        Random random = new Random();
        ArrayList<Integer> numerosBase = new ArrayList<>();
        numerosBase.add(1);
        numerosBase.add(2);
        numerosBase.add(3);
        numerosBase.add(5);
        numerosBase.add(random.nextInt(7,15));
        numerosBase.add(10);
        numerosBase.add(random.nextInt(10,20));
        numerosBase.add(25);
        Collections.shuffle(numerosBase);
        number1.setText(numerosBase.get(0).toString());
        number2.setText(numerosBase.get(1).toString());
        number3.setText(numerosBase.get(2).toString());
        number4.setText(numerosBase.get(3).toString());
        number5.setText(numerosBase.get(4).toString());
        number6.setText(numerosBase.get(5).toString());
        number7.setText(numerosBase.get(6).toString());
        number8.setText(numerosBase.get(7).toString());
        number1.setDisable(true);
        number2.setDisable(true);
        number3.setDisable(true);
        number4.setDisable(true);
        number5.setDisable(true);
        number6.setDisable(true);
        number7.setDisable(true);
        number8.setDisable(true);
        number1.setId("number1");
        number2.setId("number2");
        number3.setId("number3");
        number4.setId("number4");
        number5.setId("number5");
        number6.setId("number6");
        number7.setId("number7");
        number8.setId("number8");

        numberObjetivo.setText(calcularNumeroObjetivo(numerosBase).toString());

        btnJugar.setOnAction(ActionEvent -> operar(root));


        Scene scene = new Scene(root,400,600);
        stage.setScene(scene);
        stage.setTitle("Operación Matemática");
        stage.show();

    }

    private void operar(VBox root) {
        // continuará

    }

    private Integer calcularNumeroObjetivo(ArrayList<Integer> numerosBase) {
        Integer numeroObjetivo = 0;
        ArrayList<Integer> indicesAleatorios = new ArrayList<>();
        for (int indice = 0;indice <= 8;indice++){
            indicesAleatorios.add(indice);
        }
        Collections.shuffle(indicesAleatorios);

        numeroObjetivo = numerosBase.get(0) + numerosBase.get(1) + numerosBase.get(2);
        if (numeroObjetivo - numerosBase.get(3) > 0) {
            numeroObjetivo -= numerosBase.get(3);
        } else numeroObjetivo += numerosBase.get(3);
        numeroObjetivo += numerosBase.get(4) * numerosBase.get(5);
        if (numeroObjetivo - numerosBase.get(6) > 0) {
            numeroObjetivo -= numerosBase.get(6);
        } else if (numeroObjetivo > Math.max(numerosBase.get(6),numerosBase.get(7)) -
                Math.min(numerosBase.get(6),numerosBase.get(7))) {
            numeroObjetivo -= Math.max(numerosBase.get(6),numerosBase.get(7)) -
                    Math.min(numerosBase.get(6),numerosBase.get(7));
        }else numeroObjetivo += numerosBase.get(6);

        return numeroObjetivo;
    }

    public static void main(String[] args) {
        launch();
    }
}