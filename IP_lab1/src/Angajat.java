import java.io.*;

/**
 * Created by Alberto&Dan on 2/19/2016.
 */
public interface Angajat
{
    static void serializeObject(Object o) throws FileNotFoundException
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
    static void deserializeObject()
    {
        Object test;
        try {

            FileInputStream fis = new FileInputStream("ser/emp.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
            test= ois.readObject();
            System.out.println(test);

        } catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();
        }
    }

    /*
    public static void serializeArray(Object [] objectArray,int size) throws FileNotFoundException
    {
        try {

            for (Object object : objectArray)
            {
                    FileOutputStream fos = new FileOutputStream("ser/emp.ser");
                    ObjectOutputStream oos = new ObjectOutputStream(fos);
                    oos.writeObject(object);
                    oos.close();
                    fos.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.print("Obiecte serializate");
    }
    public static void deserializeObjectArray(int size)
    {
        Angajat [] test=new Angajat[size];
        try {
            for(Angajat o:test)
            {
                FileOutputStream fos = new FileOutputStream("ser/emp.ser");
                ObjectOutputStream oos = new ObjectOutputStream(fos);
                oos.writeObject(o);
                oos.close();
                fos.close();
                System.out.println(test);
            }
        } catch ( IOException e){
            e.printStackTrace();
        }
    }
    */
}

