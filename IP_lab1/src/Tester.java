import java.io.Serializable;

public class Tester extends Angajat implements Serializable,Money {
    public static double wage=31000.2;
public Tester(long id)
{
    this.idAngajat=id;
}
    public void setRol(String newRol)
    {
        this.rol=newRol; //if-else ststement cu tipul de tester : manual/automat ??
    }
    public double getMonthlyWage()
    {
        return wage/12;
    }
}
