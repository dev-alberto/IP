/**
 * Created by alber_000 on 2/19/2016.
 */
 public class Programator extends Angajat {

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
        return nume + "" + idAngajat + "" + adresa + ""+ skill;
    }
}
