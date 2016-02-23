
import java.io.FileNotFoundException;

public class Main
{
    public static void main(String[] args) throws FileNotFoundException {
        //Angajat angajat=Manager.getManager();
        //Angajat.serializeObject(angajat);
        //Angajat.deserializeObject();
        Programator[] ang = new Programator[3];
        ang[0] = new Programator(100, "sdads", "sdsad", "Asdsd");
        ang[1] = new Programator(122, "Automat","sds","sdaxxxxx");
        ang[2] = new Programator(222, "sdsassss", "sdsafdccc", "sdsds");
        SefiDeEchipa sefiDeEchipa=new SefiDeEchipa(ang);
        System.out.print(sefiDeEchipa); //nu merge calumea metoda toString 
        //Programator programator=new Programator(22,"sds","sdsd","Sdsadasd");
       // sefiDeEchipa.addEmployee(programator);
       // Angajat.serializeObject(sefiDeEchipa);
        //Angajat.deserializeObject();
    }
}