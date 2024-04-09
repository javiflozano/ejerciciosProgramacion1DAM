package com.iessanalberto.dam1.mkdonalds;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class MenuScreen {
    // Elementos de Layout ("estructura")
    VBox root = new VBox();
    HBox fila1 = new HBox();
    HBox fila2 = new HBox();
    HBox fila3 = new HBox();
    // Elementos para la fila 1 - Elección de tipo de pan
    Label lblPan = new Label("Elige tipo de pan: ");
    // Menú desplegable
    ObservableList<String> listaPanes = FXCollections.observableArrayList();
    ComboBox<String> cmbPanes = new ComboBox<>(listaPanes);

    // Elementos para la fila 2 - Elección de salsa con Radio Button
    Label lblSalsa = new Label("Elige salsa: ");
    ToggleGroup tglSalsas = new ToggleGroup();
    RadioButton rbtnMayonesa = new RadioButton("Mayonesa");
    RadioButton rbtnKechup = new RadioButton("Ketchup/Mostaza");
    RadioButton rbtnBarbecue = new RadioButton("Salsa barbacoa");

    Label lblExtras = new Label("Elige los extras: ");
    CheckBox chkQueso = new CheckBox("Queso");
    CheckBox chkBacon = new CheckBox("Bacon");
    CheckBox chkLechuga = new CheckBox("Lechuga");

    Button btnEnviar = new Button("Enviar");

    Button btnNavegar = new Button("Navegar");

    public MenuScreen(){
        // Añadimos opciones al comboBox con la lista de panes posibles
        listaPanes.addAll("Baguette", "Chapata", "Pan hamburguesa", "Sin glúten");
        // Agrupamos las opciones del radioButton con las salsas posibles
        rbtnMayonesa.setToggleGroup(tglSalsas);
        rbtnKechup.setToggleGroup(tglSalsas);
        rbtnBarbecue.setToggleGroup(tglSalsas);

        // Añadimos los elementos al layout correspondiente
        fila1.getChildren().addAll(lblPan, cmbPanes);
        fila2.getChildren().addAll(lblSalsa,rbtnMayonesa,rbtnKechup,rbtnBarbecue);
        fila3.getChildren().addAll(lblExtras,chkQueso,chkLechuga, chkBacon);
        root.getChildren().addAll(fila1,fila2,fila3,btnEnviar,btnNavegar);
        // Añadimos funcionalidad al botón Enviar
        btnEnviar.setOnAction(actionEvent -> enviar());
    }

    private void enviar() {
        System.out.println("Tipo de pan:");
        System.out.println("  -" + cmbPanes.getValue());
        System.out.println("Tipo de salsa:");
        System.out.println("  -" + ((RadioButton)(tglSalsas.getSelectedToggle())).getText());
        System.out.println("Extras:");
        if (chkQueso.isSelected()) System.out.println(" - Queso");
        if (chkBacon.isSelected()) System.out.println(" - Bacon");
        if (chkLechuga.isSelected()) System.out.println(" - Lechuga");
    }
}
