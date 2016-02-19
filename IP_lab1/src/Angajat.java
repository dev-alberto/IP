/**
 * Created by Alberto&Dan on 2/19/2016.
 */
public abstract class Angajat {
    protected String nume;
    protected long idAngajat;
    protected String skill;
    protected String adresa;

    public Angajat()
    {
        nume=null;
        adresa=null;
    }

    public abstract void setSkill(String newAdress);
    public String getNume()
    {
        return nume;
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
