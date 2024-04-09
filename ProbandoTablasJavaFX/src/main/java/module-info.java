module com.iessanalberto.dam1.probandotablasjavafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.iessanalberto.dam1.probandotablasjavafx to javafx.fxml;
    exports com.iessanalberto.dam1.probandotablasjavafx;
}