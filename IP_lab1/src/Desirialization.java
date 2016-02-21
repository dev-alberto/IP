import java.io.FileInputStream;
import java.io.*;


public class Desirialization {
    public static void main(String[] args) {
        Angajat[] test = new Angajat[1];
        try {
            for(Angajat o:test) {
                FileInputStream fis = new FileInputStream("ser/emp.ser");
                ObjectInputStream ois = new ObjectInputStream(fis);
                o=(Angajat) ois.readObject();
                System.out.println(o);
            }
        } catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();
        }
        System.out.print("Programator deserializat!!!\n");
    }
}