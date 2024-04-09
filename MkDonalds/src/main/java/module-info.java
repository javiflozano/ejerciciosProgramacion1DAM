module com.iessanalberto.dam1.mkdonalds {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.iessanalberto.dam1.mkdonalds to javafx.fxml;
    exports com.iessanalberto.dam1.mkdonalds;
}