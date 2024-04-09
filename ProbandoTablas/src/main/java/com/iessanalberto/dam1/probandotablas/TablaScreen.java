package com.iessanalberto.dam1.probandotablas;

import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class TablaScreen {
    // Definimos los layout de mi ventana
    VBox root = new VBox();
    HBox fila1 = new HBox();
    HBox fila2 = new HBox();
    // Añadimos los elementos de búsqueda: Label, TextField y un Button
    Label lblNombre = new Label("Nombre: ");
    TextField txtNombre = new TextField();
    Button btnBuscar = new Button("Buscar");
    // Definimos la tabla

    TableView<Persona> tablaPersonas = new TableView<>();
    // Definimos las columnas de la tabla con el encabezado que queramos
    TableColumn<Persona, String> colNombre = new TableColumn<>("Nombre");
    TableColumn<Persona, String> colApellidos = new TableColumn<>("Apellidos");
    TableColumn<Persona, String> colDireccion = new TableColumn<>("Dirección");

    public TablaScreen(){
        // Asignamos los valores de cada celda (o columna) con las correspondientes
        // propiedades de la clase
        colNombre.setCellValueFactory(new PropertyValueFactory<>("nombre"));
        colApellidos.setCellValueFactory(new PropertyValueFactory<>("apellidos"));
        colDireccion.setCellValueFactory(new PropertyValueFactory<>("domicilio"));
        // Añadimos las columnas y añadimos la tabla al layout correspondiente
        tablaPersonas.getColumns().addAll(colNombre,colApellidos,colDireccion);
        // Definir las propiedades de los layout
        fila1.setSpacing(20);
        root.setSpacing(30);
        // Añadimos los elementos a su layout correspondiente
        fila1.getChildren().addAll(lblNombre,txtNombre,btnBuscar);
        fila2.getChildren().add(tablaPersonas);
        root.getChildren().addAll(fila1,fila2);

    }
}
