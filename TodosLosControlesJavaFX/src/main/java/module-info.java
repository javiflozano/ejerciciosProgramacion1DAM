module com.iessanalberto.dam1.todosloscontrolesjavafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.iessanalberto.dam1.todosloscontrolesjavafx to javafx.fxml;
    exports com.iessanalberto.dam1.todosloscontrolesjavafx;
}