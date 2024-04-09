module com.iessanalberto.dam1.pokemon {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.iessanalberto.dam1.pokemon to javafx.fxml;
    exports com.iessanalberto.dam1.pokemon;
}