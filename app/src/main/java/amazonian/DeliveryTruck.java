package amazonian;

import java.util.ArrayList;

public class DeliveryTruck {

  public static int MAX_WEIGHT = 2000 * 1000;

  private DeliveryDriver driver;
  private ArrayList<Package> cargo = new ArrayList<Package>();

  public void addDriver(DeliveryDriver driver) {
    this.driver = driver;
  }

  public void addPackages(ArrayList<Package> packages) {
    this.cargo.addAll(packages);
  }

  public void dispatch() {
    // print order dispatched with details


  }

  public void deliver() {
    cargo.clear();
    // change status to delivered
    // add the delivery count to the driver
    // customer confirmation
  }


  
}
