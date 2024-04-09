module com.example.piedrapapeltijerajavafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.piedrapapeltijerajavafx to javafx.fxml;
    exports com.example.piedrapapeltijerajavafx;
}