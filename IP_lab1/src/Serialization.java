import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/**
 * Created by alber_000 on 2/19/2016.
 */
public class Serialization {
    public static void main(String[] args) throws FileNotFoundException {
        try {


            Programator programator = new Programator(122);
            programator.setNume("Alberto");
            programator.setRol("Java master");
            programator.setAdresa("In buricu Bucurestiului");
            FileOutputStream fos = new FileOutputStream("ser/emp.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(programator);
            oos.close();
            fos.close();
            //System.out.print(programator.toString());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
