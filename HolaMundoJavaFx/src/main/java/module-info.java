module com.iessanalberto.dam1.javiflozano.holamundojavafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.iessanalberto.dam1.javiflozano.holamundojavafx to javafx.fxml;
    exports com.iessanalberto.dam1.javiflozano.holamundojavafx;
}