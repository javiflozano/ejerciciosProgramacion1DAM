package com.iessanalberto.dam1.pokemon;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Region;
import javafx.scene.layout.VBox;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class GameScreen {
    // Definimos los elementos de mi ventana
    private final int NUM_PERSONAJES = 6;
    private ArrayList<Label> lblListaPersonajes = new ArrayList<>();
    private ArrayList<TextField> txtCaracteristicas = new ArrayList<>();
    private ArrayList<Label> lblListaEnemigos = new ArrayList<>();
    private ArrayList<TextField> txtPuntosEnemigos = new ArrayList<>();
    private int numRonda = 1;
    private Label lblRonda = new Label("Ronda " + numRonda);
    private Label [] lblAtaques = {
            new Label("PS"),
            new Label("AF"),
            new Label("AE"),
            new Label("DF"),
            new Label("DE")};
    private Label ps = new Label("PS");

    private Label selectPersonaje = new Label("Elije personaje");
    private Label selectAtack = new Label("Elije tipo de ataque");

    VBox root = new VBox();
    GridPane grid = new GridPane();
    GridPane gridEnemy = new GridPane();

    ObservableList<String> listaPersonajes = FXCollections.observableArrayList();
    ObservableList<String> listaAtaques = FXCollections.observableArrayList();

    private Button btnAtacar = new Button("Atacar!!");

    public void startGame(){
        PersonajesData data = new PersonajesData();
        ArrayList<Personaje> personajesJugador = data.obtenerPersonajes(NUM_PERSONAJES);
        ArrayList<Personaje> personajesEnemy = data.obtenerPersonajes(NUM_PERSONAJES);
        // Creamos un espacio vacío para separar partes de mi ventana
        Region spacer = new Region();
        spacer.setPrefWidth(40);
        // Definimos el grid de los Pokemon del Jugador
        grid.setMinSize(300,200);
        grid.setPadding(new Insets(10,10,10,10));
        grid.setVgap(5);
        grid.setHgap(5);
        grid.setAlignment(Pos.CENTER);
        grid.addRow(0,lblRonda);

        for (int contador = 0;contador < lblAtaques.length ;contador++){
            grid.add(lblAtaques[contador],contador + 1,1);
        }
        for (int contador = 0; contador < NUM_PERSONAJES - 1;contador++){
            // Nombre del personaje
            lblListaPersonajes.add(new Label(personajesJugador.get(contador).getNombre()));
            grid.add(lblListaPersonajes.get(contador),0,contador +2);
            // Puntos de salud
            txtCaracteristicas.add(new TextField(String.valueOf(personajesJugador.get(contador).getPuntosSalud())));
            txtCaracteristicas.getLast().setPrefWidth(30);
            grid.add(txtCaracteristicas.getLast(),1,contador +2);
            // Ataque Físico
            txtCaracteristicas.add(new TextField(String.valueOf(personajesJugador.get(contador).getAtaqueFisico())));
            txtCaracteristicas.getLast().setPrefWidth(30);
            grid.add(txtCaracteristicas.getLast(),2,contador +2);
            // Ataque Especial
            txtCaracteristicas.add(new TextField(String.valueOf(personajesJugador.get(contador).getAtaqueEspecial())));
            txtCaracteristicas.getLast().setPrefWidth(30);
            grid.add(txtCaracteristicas.getLast(),3,contador +2);
            // Defensa Físico
            txtCaracteristicas.add(new TextField(String.valueOf(personajesJugador.get(contador).getDefensaFisica())));
            txtCaracteristicas.getLast().setPrefWidth(30);
            grid.add(txtCaracteristicas.getLast(),4,contador +2);
            // Defensa Especial
            txtCaracteristicas.add(new TextField(String.valueOf(personajesJugador.get(contador).getDefensaEspecial())));
            txtCaracteristicas.getLast().setPrefWidth(30);
            grid.add(txtCaracteristicas.getLast(),5,contador +2);
        }

        // Definimos el grid de los Pokemon del Enemigo
        gridEnemy.setMinSize(300,200);
        gridEnemy.setPadding(new Insets(10,10,10,10));
        gridEnemy.setVgap(5);
        gridEnemy.setHgap(5);
        gridEnemy.setAlignment(Pos.CENTER);
        gridEnemy.addRow(0,spacer);
        gridEnemy.add(ps,0,1);
        for (int contador = 0;contador < NUM_PERSONAJES - 1;contador++){
            txtPuntosEnemigos.add(new TextField(String.valueOf(personajesEnemy.get(contador).getPuntosSalud())));
            txtPuntosEnemigos.getLast().setPrefWidth(30);
            gridEnemy.add(txtPuntosEnemigos.getLast(),0,contador +2);
            lblListaEnemigos.add(new Label(personajesEnemy.get(contador).getNombre()));
            gridEnemy.add(lblListaEnemigos.get(contador),2,contador +2);
        }

        // Añadimos los personajes al combo de ataque y creamos el combo
        listaPersonajes
                .addAll(personajesJugador
                        .stream()
                        .map(personaje -> personaje.getNombre())
                        .collect(Collectors.toList()));
        ComboBox<String> comboPersonajes =
                new ComboBox<>(listaPersonajes);

        listaAtaques.addAll("Ataque físico","Ataque especial", "Cambio de personaje");
        ComboBox<String> comboAtaques = new ComboBox<>(listaAtaques);

        HBox fila1 = new HBox();
        HBox fila2 = new HBox();
        HBox fila3 = new HBox();
        HBox fila4 = new HBox();

        root.setSpacing(10);
        fila2.setSpacing(20);
        fila3.setSpacing(20);
        fila2.setAlignment(Pos.CENTER);
        fila3.setAlignment(Pos.CENTER);
        fila4.setAlignment(Pos.CENTER);
        fila1.getChildren().addAll(grid,gridEnemy);
        fila2.getChildren().addAll(selectPersonaje,selectAtack);
        fila3.getChildren().addAll(comboPersonajes,comboAtaques);
        fila4.getChildren().add(btnAtacar);
        root.getChildren().addAll(fila1,fila2,fila3,fila4);
    }

}
