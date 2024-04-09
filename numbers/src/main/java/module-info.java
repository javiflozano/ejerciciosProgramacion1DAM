module com.example.numbers {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.numbers to javafx.fxml;
    exports com.example.numbers;
}