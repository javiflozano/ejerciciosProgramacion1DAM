module com.iessanalberto.dam1.holamundo2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.iessanalberto.dam1.holamundo2 to javafx.fxml;
    exports com.iessanalberto.dam1.holamundo2;
}