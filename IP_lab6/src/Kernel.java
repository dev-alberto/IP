import Managers.DiskAccess;
import Managers.DriverManager;


import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Kernel
{
  private static Kernel instance=new Kernel();

  private List<Signals> signals=new ArrayList<>();
  private List<DiskAccess> diskAccesses=new ArrayList<>();
  private List<DriverManager> driverManagers=new ArrayList<>();
  private List<Multitasking> multitaskings=new ArrayList<>();

  private void Kernel() {}

  public Kernel getInstance(){return instance;}

  private void registerSignal(String name, Signals signal)
  {
    signals.add(signal);
  }

}