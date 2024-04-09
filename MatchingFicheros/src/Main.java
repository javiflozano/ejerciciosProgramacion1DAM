import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class Main {
    public static void main(String[] args) {
        try{
            BufferedReader ficheroA = new BufferedReader(new FileReader("ficheroA.txt"));
            BufferedReader ficheroB = new BufferedReader(new FileReader("ficheroB.txt"));
            FileWriter ficheroSoloEnA = new FileWriter("ficheroSoloEnA.txt");
            FileWriter ficheroSoloEnB = new FileWriter("ficheroSoloEnB.txt");
            FileWriter ficheroEnAyB = new FileWriter("ficheroEnAyB.txt");
            String claveA = ficheroA.readLine();
            String claveB = ficheroB.readLine();
            while (claveA != null && claveB != null){
                if (claveA.equals(claveB)){
                    ficheroEnAyB.write(claveA + "\n");
                    claveA = ficheroA.readLine();
                    claveB = ficheroB.readLine();
                } else if (claveA.compareTo(claveB) > 0){
                    ficheroSoloEnB.write(claveB + "\n");
                    claveB = ficheroB.readLine();
                } else {
                    ficheroSoloEnA.write(claveA+ "\n");
                    claveA = ficheroA.readLine();
                }
            }
            while (claveA !=null){
                ficheroSoloEnA.write(claveA);
                claveA = ficheroA.readLine();
            }
            while (claveB !=null){
                ficheroSoloEnB.write(claveB);
                claveB = ficheroB.readLine();
            }
            ficheroA.close();
            ficheroB.close();
            ficheroSoloEnA.close();
            ficheroSoloEnB.close();
            ficheroEnAyB.close();

        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}