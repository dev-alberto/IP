import java.io.Serializable;

/**
 * Created by alber_000 on 2/19/2016.
 */
 public class Programator extends Angajat implements Serializable {

    public Programator(long idAngajat)
    {
        this.idAngajat=idAngajat;
    }
    public Programator(long idAngajat,String nume,String skill,String adresa)
    {
        this.idAngajat=idAngajat;
        this.nume=nume;
        this.skill=skill;
        this.adresa=adresa;
    }
    @Override
    public void setSkill(String newSkill) {
        this.skill=newSkill;
    }
    public String getSkill()
    {
        return skill;
    }
    public String toString()
    {
        return skill+ " " + idAngajat+ " " + ",cu numele " + nume + " " + ",sta la adresa" + " " +  " " + adresa;
    }

}
