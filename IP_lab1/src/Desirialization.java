import java.io.FileInputStream;
import java.io.*;

/**
 * Created by alber_000 on 2/20/2016.
 */
public class Desirialization {
    public static void main(String[] args) {
        Angajat test = null;
        try {
            FileInputStream fis = new FileInputStream("ser/emp.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
            test = (Angajat) ois.readObject();
        } catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();
        }
        System.out.print("Programator deserializat!!!\n");
        System.out.print(test);
    }
}