import java.io.Serializable;
import java.util.*;

public class SefiDeGrupa extends SefiDeEchipa implements Serializable
{
    List<SefiDeEchipa> sefiDeEchipas=new ArrayList<>();

    public SefiDeGrupa(){}
    public SefiDeGrupa(long id,SefiDeEchipa [] sefi)
    {
        for(int i=0;i<sefi.length;i++)
            this.sefiDeEchipas.add(sefi[i]);
        this.idAngajat=id;
    }
    public void addEmployee(SefiDeEchipa p)
    {
        this.sefiDeEchipas.add(p);
    }
    public String toString()
    {
        return "Seful de grupa cu id-ul " + idAngajat + " are lista de sefi de echipa care sunt subordonati lui: " + "\n" + sefiDeEchipas + "\n";
    }
}
