module com.iessanalberto.dam1.jdbc {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.iessanalberto.dam1.jdbc to javafx.fxml;
    exports com.iessanalberto.dam1.jdbc;
    exports com.iessanalberto.dam1.jdbc.screens;
    opens com.iessanalberto.dam1.jdbc.screens to javafx.fxml;
}