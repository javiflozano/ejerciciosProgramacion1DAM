module com.iessanalberto.dam1.probandoalertas {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.iessanalberto.dam1.probandoalertas to javafx.fxml;
    exports com.iessanalberto.dam1.probandoalertas;
}