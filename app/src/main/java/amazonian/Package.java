package amazonian;

import java.util.ArrayList;

public class Package {

  public static int MAX_WEIGHT = 50 * 1000;

  private Order order;
  private ArrayList<Product> products;
  private int weight;

  public Package(Order order, ArrayList<Product> products, int weight) {
    this.order = order;
    this.products = products;
    this.weight = weight;
  }

  public Order getOrder() {
    return order;
  }

  public ArrayList<Product> getProducts() {
    return products;
  }

  public int getWeight() {
    return weight;
  }

  

 
  
}
