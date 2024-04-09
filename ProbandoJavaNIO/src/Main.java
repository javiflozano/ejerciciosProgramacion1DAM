import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            Path miRuta = Path.of("src/miFichero");
            Files.createFile(miRuta);
            Files.write(miRuta,"Hola mundo".getBytes());
            List<String> miFichero = Files.readAllLines(miRuta);
            System.out.println(miFichero.get(0));
        }catch (Exception exception){
            exception.printStackTrace();
        }

    }
}