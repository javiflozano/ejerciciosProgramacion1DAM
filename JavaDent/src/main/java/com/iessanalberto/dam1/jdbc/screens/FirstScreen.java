package com.iessanalberto.dam1.jdbc.screens;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;

public class FirstScreen {
    // Elementos de Layout
    public VBox root = new VBox();
    HBox fila1 = new HBox();
    HBox fila2 = new HBox();
    // Elementos propios de la ventana
    public Button btnClientes = new Button("Clientes");
    Button btnTrabajadores =new Button("Plantilla");
    Button btnCitas = new Button("Citas");
    Button btnFacturacion = new Button("Facturación");

    public FirstScreen() {
        // Definimos el aspecto de mi ventana
        root.setAlignment(Pos.CENTER);
        fila1.setAlignment(Pos.CENTER);
        fila2.setAlignment(Pos.CENTER);
        root.setSpacing(15);
        fila1.setSpacing(15);
        fila2.setSpacing(15);
        btnClientes.setPrefSize(150,150);
        btnTrabajadores.setPrefSize(150,150);
        btnFacturacion.setPrefSize(150,150);
        btnCitas.setPrefSize(150,150);
        btnClientes.setFont(Font.font(22));
        btnTrabajadores.setFont(Font.font(22));
        btnCitas.setFont(Font.font(22));
        btnFacturacion.setFont(Font.font(22));
        // Añadimos los elementos a sus layout correspondientes
        fila1.getChildren().addAll(btnClientes,btnTrabajadores);
        fila2.getChildren().addAll(btnCitas,btnFacturacion);
        root.getChildren().addAll(fila1,fila2);
        // Añadimos la interactividad a los botones

    }
}
