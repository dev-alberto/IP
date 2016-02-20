import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/**
 * Created by alber_000 on 2/19/2016.
 */
public class Serialization {
    public static void main(String[] args) throws FileNotFoundException {
        try {


            Angajat angajat=new Programator(122,"Alberto","java","buricul pamantului");
            FileOutputStream fos = new FileOutputStream("ser/emp.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(angajat);
            oos.close();
            fos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.print("Obiect serializat");
    }
}
