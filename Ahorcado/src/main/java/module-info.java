module com.iessanalberto.dam1.jdbc {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.iessanalberto.dam1.jdbc to javafx.fxml;
    exports com.iessanalberto.dam1.jdbc;
}