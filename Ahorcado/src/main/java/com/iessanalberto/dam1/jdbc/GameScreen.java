package com.iessanalberto.dam1.jdbc;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;

import java.util.ArrayList;

public class GameScreen {
    public VBox root = new VBox();
    GridPane rootGrid = new GridPane();
    Label lblSecretWord = new Label();
    Label lblIntro = new Label("Introduce letra");
    TextField txtCharPlayer = new TextField();
    Button btnComprobar = new Button("Comprobar");
    Label lblMensajes = new Label();
    ArrayList<Image> images = new ArrayList<>();
    int indiceImagen = -1;
    ImageView marcoImagen = new ImageView();
    Ahorcado ahorcado = new Ahorcado();

    public GameScreen() {
        root.setAlignment(Pos.CENTER);
        root.setSpacing(10);
        lblSecretWord.setText(ahorcado.wordAttemptToShow());
        lblSecretWord.setStyle("-fx-font-size: 24px; -fx-letter-spacing: 20px;");
        lblSecretWord.setPrefWidth(200);
        lblMensajes.setStyle("-fx-font-size: 24px; -fx-letter-spacing: 20px;");
        rootGrid.setPadding(new Insets(10,10,10,10));
        rootGrid.setVgap(10);
        rootGrid.setHgap(10);
        // Asignamos los componentes al layout principal
        rootGrid.add(lblSecretWord,0,0);
        rootGrid.add(lblIntro, 0, 1);
        rootGrid.add(txtCharPlayer,1,1);
        rootGrid.add(btnComprobar,2,1);
        root.getChildren().addAll(rootGrid, lblMensajes, marcoImagen);
        // Asignamos las imágenes
        images.add(new Image("ahorcado1.png"));
        images.add(new Image("ahorcado2.png"));
        images.add(new Image("ahorcado3.png"));
        images.add(new Image("ahorcado4.png"));
        images.add(new Image("ahorcado5.png"));
        images.add(new Image("ahorcado6.png"));
        // Asignamos la interactividad a la ventana
        btnComprobar.setOnAction(actionEvent -> {
            if (ahorcado.comprobarPalabra(txtCharPlayer.getText().charAt(0))){
                lblSecretWord.setText(ahorcado.wordAttemptToShow());
            } else {
                lblMensajes.setText(lblMensajes.getText() + " " + txtCharPlayer.getText().charAt(0));
                indiceImagen++;
                marcoImagen.setImage(images.get(indiceImagen));
            }
            txtCharPlayer.setText("");
        });

    }
}
