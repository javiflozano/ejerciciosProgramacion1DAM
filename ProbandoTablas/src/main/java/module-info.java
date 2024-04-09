module com.iessanalberto.dam1.probandotablas {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.iessanalberto.dam1.probandotablas to javafx.fxml;
    exports com.iessanalberto.dam1.probandotablas;
}