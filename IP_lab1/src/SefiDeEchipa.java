import java.io.Serializable;

public class SefiDeEchipa extends Angajat implements Serializable,Money {
    @Override
    public double getMonthlyWage() {
        return 0;
    }

    @Override
    public void setRol(String newRol) {

    }
}
