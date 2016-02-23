import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


public class Manager extends SefiDeGrupa implements Serializable
{  //singleton class

    private long idAngajat;
    private String nume;
    private String adresa;

    private static Manager manager=new Manager(100,"Alberto","undeva fain");
    List<SefiDeGrupa> angajats=new ArrayList<>();

    private Manager(long idAngajat,String nume,String adresa)
    {
        this.idAngajat=idAngajat;
        this.nume=nume;
        this.adresa=adresa;
    }
    public void setAngajats(SefiDeGrupa [] a)
    {
        for(int i=0;i<a.length;i++)
            angajats.add(a[i]);
    }
    public static Manager getManager()
    {
        return manager;
    }
    public String toString()
    {
        return "Angajatul cu id "  + idAngajat+ " " + ",cu numele " + nume + " " + ", sta la adresa" + " " + adresa + " si castiga" ;
    }

}
