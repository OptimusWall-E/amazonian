package amazonian;

import java.util.ArrayList;

public class Customer {
  private String name;
  private String address;
  private String email;
  private String phone;
  private String cardDetails;
  private ArrayList<Order> orders = new ArrayList<Order>();

  public Customer(String name, String address, String email, String phone) {
    this.name = name;
    this.address = address;
    this.email = email;
    this.phone = phone;
  }

  public String getName() {
    return name;
  }

  public String getAddress() {
    return address;
  }

  public String getEmail() {
    return email;
  }

  public String getPhone() {
    return phone;
  }

  public void addCardDetails(String cardDetails) {
    this.cardDetails = cardDetails;
  }

  public void addOrder(Order order) {
    this.orders.add(order);
  }

  public ArrayList<Order> viewOrders() {
    return this.orders;
  }

  public String getCardDetails() {
    return this.cardDetails;
  }

}
