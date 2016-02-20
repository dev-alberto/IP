import java.io.Serializable;

/**
 * Created by Alberto&Dan on 2/19/2016.
 */
public abstract class Angajat implements Serializable {
    protected String nume;
    protected long idAngajat;
    protected String rol;
    protected String adresa;

    public Angajat()
    {
       idAngajat=0;
    }

    public abstract void setRol(String newRol);
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

}
