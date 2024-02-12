/**
 * Version: 1.0
 * Author; Javi F. Lozano
 * Date: 12-feb-2024
 * Description: Creación y escritura de un fichero .XML
 * Este ejemplo genera el siguiente fichero de salida:
 *
 * <concesionario>
 *   <coches>
 *     <coche>
 *        <matricula>3224JVD</matricula>
 *        <marca>Tesla</marca>
 *        <precio>53.000 €</precio>
 *     </coche>
 *   </coches>
 * </concesionario>
 *
 * */

import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Text;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;

public class Main {
    public static void main(String[] args) {
        try {
            // Generamos el documento
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            DOMImplementation implementation = builder.getDOMImplementation();
            // Definimos el nodo raíz y la versión. Dejamos a null el namespace y el doctype (pero si hace falta, irían ahí)
            Document document = implementation.createDocument(null,"concesionario",null);
            document.setXmlVersion("1.0");
            // Añadimos los elementos o nodos de mi fichero xml
            Element coches = document.createElement("coches");
            Element coche = document.createElement("coche");
            // Añadimos elementos al coche: matrícula, marca y precio
            // MATRÍCULA
            Element matricula = document.createElement("matricula");
            // Le damos valor a esta etiqueta
            Text textMatricula = document.createTextNode("3224JVD");
            // Se lo asignamos a su nodo
            matricula.appendChild(textMatricula);
            coche.appendChild(matricula);
            // MARCA
            Element marca = document.createElement("marca");
            Text txtMarca = document.createTextNode("Tesla");
            marca.appendChild(txtMarca);
            coche.appendChild(marca);
            // PRECIO
            Element precio = document.createElement("precio");
            Text txtPrecio = document.createTextNode("53.000 €");
            precio.appendChild(txtPrecio);
            coche.appendChild(precio);

            // Añadimos coche a su nodo raíz coches y este a su vez al raíz
            coches.appendChild(coche);
            document.getDocumentElement().appendChild(coches);

            // Añadimos el source y el result
            Source source = new DOMSource(document);
            Result result = new StreamResult(new File("concesionario.xml"));

            // Creamos el trasnfomer
            Transformer transformer = TransformerFactory.newInstance().newTransformer();
            transformer.transform(source,result);

        } catch (Exception exception){
            exception.printStackTrace();
        }

    }
}