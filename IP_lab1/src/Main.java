

import java.io.FileNotFoundException;
import java.util.Arrays;


public class Main
{
    public static void main(String[] args) throws FileNotFoundException
    {
        ProgramatorSiTester[] ang = new ProgramatorSiTester[4];
        ProgramatorSiTester[] ang2=new ProgramatorSiTester[4];
        ang[0] = new ProgramatorSiTester(1,"Victor","Alea Rozelor",false);
        ang[0].setRole("java");
        ang[1] = new ProgramatorSiTester(2, "Stefan","In locuri mai bune",false);
        //ang[2] =new ProgramatorSiTester(14,"New Hire", "in centru",true);
        ang2[0] = new ProgramatorSiTester(3, "Andrei", "Undeva", true);
        ang2[1]=new ProgramatorSiTester(22,"Moloz","nictor",false);
        ang2[1].setRole("c++");
        SefiDeEchipa [] sefiDeEchipa=new SefiDeEchipa[3];
        sefiDeEchipa[0]=new SefiDeEchipa(100,ang);
        sefiDeEchipa[1]=new SefiDeEchipa(101,ang2);
        //sefiDeEchipa[0].addEmployee(ang[2]);
        SefiDeGrupa[] sefiDeGrupa=new SefiDeGrupa[3];
        sefiDeGrupa[0]=new SefiDeGrupa(200,sefiDeEchipa);
        Manager manager=Manager.getManager();
        manager.setAngajats(sefiDeGrupa);
        Angajat.serializeObject(manager);
        Angajat.deserializeObject();
    }
}