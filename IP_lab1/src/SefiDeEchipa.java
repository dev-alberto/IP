import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SefiDeEchipa extends Programator implements Serializable,Angajat
{
    List<Programator> programators=new ArrayList<>();
    public SefiDeEchipa(){}
    public SefiDeEchipa(Programator [] arr) // Cand creem un Sef de echipa, practic noi ii dam la constructor lista de programatori
    {
        for(int i=0;i<arr.length;i++)
            this.programators.add(arr[i]);
    }

    public void addEmployee(Programator p)
    {
        this.programators.add(p);
    }
    public String toString() {
    return "Lista de programatori: " + programators;
    }
}
