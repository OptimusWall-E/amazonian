package amazonian;

import java.util.ArrayList;

public class Order {

  private Customer customer;
  private ArrayList<Product> products;
  private boolean isUrgent;
  private String status = "Order Processing";

  public Order(Customer customer, ArrayList<Product> products, boolean isUrgent) {
    this.customer = customer;
    this.products = products;
    this.isUrgent = isUrgent;
  }
  
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public Customer getCustomer() {
    return customer;
  }

  public ArrayList<Product> getProducts() {
    return products;
  }

  public boolean isUrgent() {
    return isUrgent;
  }
  
}
