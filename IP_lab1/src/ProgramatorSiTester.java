

import java.io.Serializable;


 public class ProgramatorSiTester extends Angajat implements Serializable { //trebuie sa adaugam testarii tot in clasa asta
    // private final double wage=50000.0;
     private boolean flag;
     private String rol;
     private long idAngajat;
     private String nume;
     private String adresa;
     protected ProgramatorSiTester(){}
    public ProgramatorSiTester(long idAngajat, String nume, String adresa,boolean flag)
    {
        this.idAngajat=idAngajat;
        this.nume=nume;
        this.adresa=adresa;
        this.flag =flag;
    }
     public ProgramatorSiTester(boolean flag)
     {
         this.flag =flag;
     }
     public void setRole(String specializare)
     {
         if (flag)
         {
             rol="tester";
             if("automat".equals(specializare))
                 rol=rol+"automat";
             else if("manual".equals(specializare))
                 rol=rol+"manual";
         }
         else
         {
             rol="programator";
             if("c++".equals(specializare))
                 rol=rol+" in c++";
             else if("java".equals(specializare))
                 rol= rol+ " in java";
         }
     }

    public String toString()
    {
       return  idAngajat+ " " + ",cu numele " + nume + " " + ",sta la adresa" + " " +  " " + adresa + " si este "+ rol + "\n";
    }
 }
