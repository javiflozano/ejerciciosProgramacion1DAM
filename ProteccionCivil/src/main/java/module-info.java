module com.iessanalberto.dam1.proteccioncivil {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.iessanalberto.dam1.proteccioncivil to javafx.fxml;
    exports com.iessanalberto.dam1.proteccioncivil;
}