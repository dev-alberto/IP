import java.io.Serializable;

/**
 * Created by Alberto&Dan on 2/19/2016.
 */
public class Angajat implements Serializable {
    protected String nume;
    protected long idAngajat;
    protected String adresa;

    public Angajat()
    {
       idAngajat=0;
    }
    public Angajat(long idAngajat,String nume)
    {
        this.nume=nume;
        this.idAngajat=idAngajat;
    }
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

}
