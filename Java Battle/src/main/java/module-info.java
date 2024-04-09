module com.iessanalberto.dam1.javiflozano.javabattle {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.iessanalberto.dam1.javiflozano.javabattle to javafx.fxml;
    exports com.iessanalberto.dam1.javiflozano.javabattle;
}