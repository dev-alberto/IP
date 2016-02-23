
import java.io.FileNotFoundException;

public class Main
{
    public static void main(String[] args) throws FileNotFoundException {
        //Angajat angajat=Manager.getManager();
        //Angajat.serializeObject(angajat);
        //Angajat.deserializeObject();
        //ProgramatorSiTester[] ang = new ProgramatorSiTester[3];
        //ang[0] = new ProgramatorSiTester(100,"Al","sds",false);
        //ang[1] = new ProgramatorSiTester(122, "Automat","sds","sdaxxxxx");
        //ang[2] = new ProgramatorSiTester(222, "sdsassss", "sdsafdccc", "sdsds");
        //SefiDeEchipa sefiDeEchipa=new SefiDeEchipa(ang);
        //System.out.print(sefiDeEchipa.toString()); //nu merge calumea metoda toString
        ProgramatorSiTester programator=new ProgramatorSiTester(22,"sds","sdsd",false);
        programator.setRole("c++");
       // System.out.print(programator);
        //ProgramatorSiTester prgramator2=new ProgramatorSiTester(33,"sds","sdsd","Sdsadassdad");
        //sefiDeEchipa.addEmployee(programator);
        //sefiDeEchipa.addEmployee(prgramator2);
        //Angajat.serializeObject(sefiDeEchipa);
        Angajat.serializeObject(programator);
        Angajat.deserializeObject();
    }
}