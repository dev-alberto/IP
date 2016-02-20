import java.io.Serializable;


 public class Programator extends Angajat implements Serializable,Money {
     private final double wage=50000.0;
     private String rol;

    public Programator()
    {
        rol=null;
    }
    public Programator(long idAngajat,String nume,String skill,String adresa)
    {
        this.idAngajat=idAngajat;
        this.nume=nume;
        this.rol=skill;
        this.adresa=adresa;
    }

    public void setRol(String newRol) {
        this.rol=newRol; //aici vom face un switch cu limbaje de programare
    }
    public String getRol()
    {
        return rol;
    }
    public String toString()
    {
        return rol+ " " + idAngajat+ " " + ",cu numele " + nume + " " + ",sta la adresa" + " " +  " " + adresa +  " ,castiga " + this.getMonthlyWage();
    }

     @Override
     public double getMonthlyWage() {
         return wage/12;
     }

 }
