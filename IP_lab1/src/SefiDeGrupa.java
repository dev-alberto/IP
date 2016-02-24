import java.io.Serializable;
import java.util.*;

public class SefiDeGrupa extends SefiDeEchipa implements Serializable
{
    List<SefiDeEchipa> sefiDeEchipas=new ArrayList<>();

    public SefiDeGrupa(){}
    public SefiDeGrupa(SefiDeEchipa [] sefi)
    {
        for(int i=0;i<sefi.length;i++)
            this.sefiDeEchipas.add(sefi[i]);
    }
    public void addEmployee(SefiDeEchipa p)
    {
        this.sefiDeEchipas.add(p);
    }
    public String toString()
    {
        return "Lista de sefi de echipa care sunt subordonati mie: " + sefiDeEchipas;
    }
}
