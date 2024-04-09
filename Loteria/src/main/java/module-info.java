module com.iessanalberto.dam1.loteria {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.iessanalberto.dam1.loteria to javafx.fxml;
    exports com.iessanalberto.dam1.loteria;
}