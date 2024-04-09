module com.example.probandojavafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.probandojavafx to javafx.fxml;
    exports com.example.probandojavafx;
}