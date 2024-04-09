module com.example.probandocombobox {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.probandocombobox to javafx.fxml;
    exports com.example.probandocombobox;
}