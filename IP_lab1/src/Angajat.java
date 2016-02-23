import java.io.*;

/**
 * Created by Alberto&Dan on 2/19/2016.
 */
public class Angajat implements Serializable
{
    protected String nume;
    protected long idAngajat;
    protected String adresa;

    public Angajat() {}

    public String getNume()
    {
        return nume;
    }
    public void setNume(String newName)
    {
        nume=newName;
    }
    public long getIdAngajat()
    {
        return idAngajat;
    }
    protected void setIdAngajat(long newId) //cannot modify employee ID once you set it using the constructor
    {
        idAngajat=newId;
    }
    public String getAdresa()
    {
        return adresa;
    }
    public void setAdresa(String newAdress)
    {
        adresa=newAdress;
    }
    public String toString()
    {
        return  idAngajat+ " " + ",cu numele " + nume + " " + ",sta la adresa" + " " +  " " + adresa;
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
    public static void deserializeObject()
    {
        Angajat test;
        try {

            FileInputStream fis = new FileInputStream("ser/emp.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
            test=(Angajat) ois.readObject();
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

