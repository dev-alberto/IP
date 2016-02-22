
import java.io.FileNotFoundException;

public class Main
{
    public static void main(String[] args) throws FileNotFoundException
    {
        Angajat angajat=Manager.getManager();
        Angajat.serializeObject(angajat);
        Angajat.deserializeObject();
    }

}
