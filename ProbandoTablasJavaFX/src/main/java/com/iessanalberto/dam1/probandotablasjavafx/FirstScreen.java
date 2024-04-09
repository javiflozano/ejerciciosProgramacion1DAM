package com.iessanalberto.dam1.probandotablasjavafx;

import com.iessanalberto.dam1.probandotablasjavafx.models.Alumno;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;

public class FirstScreen {
    VBox root = new VBox();
    // Definimos la tabla
    TableView<Alumno> tablaAlumnos = new TableView<>();
    TableColumn<Alumno,String> colNombre = new TableColumn<>("Nombre");
    TableColumn<Alumno,String> colApellido = new TableColumn<>("Apellidos");
    TableColumn<Alumno,Integer> colNotaBD = new TableColumn<>("Bases de datos");
    TableColumn<Alumno,Integer> colNotaProgramacion = new TableColumn<>("Programación");
    TableColumn<Alumno,Integer> colNotaEntornosDesarrollo = new TableColumn<>("Entornos de desarrollo");
    TableColumn<Alumno,Integer> colNotaLenguajeMarcas = new TableColumn<>("Lenguaje de marcas");
    TableColumn<Alumno,Integer> colNotaSistemas = new TableColumn<>("Sistemas Informáticos");
    TableColumn<Alumno,Integer> colNotaIngles = new TableColumn<>("Inglés");
    TableColumn<Alumno,Integer> colNotaFOL = new TableColumn<>("FOL");
    TableColumn<Alumno,Integer> colMedia = new TableColumn<>("Media");
    TableColumn<Alumno,Integer> colNumSuspensos = new TableColumn<>("Suspensos");

    void loadTabla(){
        // Añadimos las columnas a la tabla
        tablaAlumnos.getColumns().addAll(
                colNombre,
                colApellido,
                colNotaBD,
                colNotaProgramacion,
                colNotaEntornosDesarrollo,
                colNotaLenguajeMarcas,
                colNotaIngles,
                colNotaFOL,
                colNumSuspensos,
                colMedia);

        // Conectamos los datos de cada columna con su correspondiente propiedad de la clase Persona
        colNombre.setCellValueFactory(new PropertyValueFactory<>("nombre"));
        colApellido.setCellValueFactory(new PropertyValueFactory<>("apellidos"));
        colNotaBD.setCellValueFactory(new PropertyValueFactory<>("notaBD"));
        colNotaProgramacion.setCellValueFactory(new PropertyValueFactory<>("notaProgramacion"));
        colNotaEntornosDesarrollo.setCellValueFactory(new PropertyValueFactory<>("notaEntornosDesarrollo"));
        colNotaLenguajeMarcas.setCellValueFactory(new PropertyValueFactory<>("notaLenguajeMarcas"));
        colNotaIngles.setCellValueFactory(new PropertyValueFactory<>("notaIngles"));
        colNotaFOL.setCellValueFactory(new PropertyValueFactory<>("notaFOL"));
        colNumSuspensos.setCellValueFactory(new PropertyValueFactory<>("numSuspensos"));
        colMedia.setCellValueFactory(new PropertyValueFactory<>("media"));

    }
}
