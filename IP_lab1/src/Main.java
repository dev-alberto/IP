

import java.io.FileNotFoundException;
import java.util.Arrays;


public class Main
{
    public static void main(String[] args) throws FileNotFoundException {


        ProgramatorSiTester[] ang = new ProgramatorSiTester[2];
        ProgramatorSiTester[] ang2=new ProgramatorSiTester[2];
        ang[0] = new ProgramatorSiTester(1,"Alb","sds",false);
        ang[0].setRole("java");
        ang[1] = new ProgramatorSiTester(2, "ASZ","sds",false);
        ang2[0] = new ProgramatorSiTester(3, "sdsassss", "Undeva", true);
        ang2[1]=new ProgramatorSiTester(22,"sds","sdsd",false);
        ang2[1].setRole("c++");
        SefiDeEchipa [] sefiDeEchipa=new SefiDeEchipa[2];
        sefiDeEchipa[0]=new SefiDeEchipa(ang);
        sefiDeEchipa[1]=new SefiDeEchipa(ang2);
        SefiDeGrupa[] sefiDeGrupa=new SefiDeGrupa[2];
        sefiDeGrupa[0]=new SefiDeGrupa(sefiDeEchipa);
        sefiDeGrupa[1]=null;
        Manager manager=Manager.getManager();
        manager.setAngajats(sefiDeGrupa);
        System.out.print(manager);
        //System.out.print(Arrays.toString(sefiDeGrupa));
        //System.out.print(Arrays.toString(sefiDeEchipa));
       // System.out.print(programator);
        //ProgramatorSiTester prgramator2=new ProgramatorSiTester(33,"sds","sdsd","Sdsadassdad");

    }
}