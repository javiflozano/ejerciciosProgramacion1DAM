module com.example.aterrizacomopuedas {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.aterrizacomopuedas to javafx.fxml;
    exports com.example.aterrizacomopuedas;
}