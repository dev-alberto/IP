
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;


public class Serialization {
    public static void serializeArray() throws FileNotFoundException {
        try {
            Object [] objectArray;
            for (Object o : objectArray = new Angajat[5]) {
                for (int i = 0; i < 5; i++) {
                    objectArray[i] = new Angajat();
                    FileOutputStream fos = new FileOutputStream("ser/emp.ser");
                    ObjectOutputStream oos = new ObjectOutputStream(fos);
                    oos.writeObject(o);
                    oos.close();
                    fos.close();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.print("Obiecte serializate");
    }
    public static void serializeObject(Object o) throws FileNotFoundException
    {
        try
        {
            FileOutputStream fos = new FileOutputStream("ser/emp.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(o);
            oos.close();
            fos.close();
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) throws FileNotFoundException {

       // serializeArray();
        Angajat angajat=Manager.getManager();
        serializeObject(angajat);
    }

}
