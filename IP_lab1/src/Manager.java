import java.io.Serializable;


public class Manager extends Angajat implements Serializable,Money{  //singleton class

    private static Manager manager=new Manager(100,"Alberto","undeva fain");
    private final double wage=12323.232;
    private String rol="Boss man";

    private Manager(long idAngajat,String nume,String adresa)
    {
        this.idAngajat=idAngajat;
        this.nume=nume;
        this.adresa=adresa;
    }
    public static Manager getManager()
    {
        return manager;
    }
    public String toString()
    {
        return "Angajatul cu rolul " + rol+ " " + "are id " + idAngajat+ " " + ",cu numele " + nume + " " + ", sta la adresa" + " " + adresa + " si castiga" + " " + manager.getMonthlyWage();
    }

    @Override
    public double getMonthlyWage() {
        return wage/12;
    }

    @Override
    public void setRol(String newRol) {
        newRol=null;
    }
}
