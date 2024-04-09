package com.iessanalberto.dam1.todosloscontrolesjavafx;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class FirstScreen {
    VBox root = new VBox();

    HBox fila1 = new HBox();
    HBox fila2 = new HBox();
    HBox fila3 = new HBox();

    Label lblPan = new Label("Elige tipo de pan: ");
    // Definimos el ComboBox
    ObservableList<String> listaPanes = FXCollections.observableArrayList();
    ComboBox<String> cmbPanes = new ComboBox<>(listaPanes);

    // Creamos el RadioButton con su correspondiente ToggleGroup
    Label lblRelleno = new Label("Elige bocadillo: ");
    ToggleGroup tglBocadillos = new ToggleGroup();
    RadioButton rbtnHambuerguesa = new RadioButton("Hamburguesa");
    RadioButton rbtnBacon = new RadioButton("Bocadillo de bacon");
    RadioButton rbtnPechugas = new RadioButton("Bocadillo de pechugas");
    RadioButton rbtnVegetal = new RadioButton("Vegetal");

    public FirstScreen(){
        // Añadimos opciones al comboBox
        listaPanes.addAll("Baguete", "Chapata", "Pan hamburguesa", "Sin glutén");
        // Añadimos los RadioButton al ToggleGroup
        rbtnHambuerguesa.setToggleGroup(tglBocadillos);
        rbtnBacon.setToggleGroup(tglBocadillos);
        rbtnPechugas.setToggleGroup(tglBocadillos);
        rbtnVegetal.setToggleGroup(tglBocadillos);

        // Añadimos los elementos a su layout correspondiente
        fila1.getChildren().addAll(lblPan,cmbPanes);
        fila2.getChildren().addAll(lblRelleno,rbtnHambuerguesa,rbtnBacon,rbtnPechugas,rbtnVegetal);
        root.getChildren().addAll(fila1,fila2,fila3);
    }
}
