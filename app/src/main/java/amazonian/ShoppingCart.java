package amazonian;

import java.util.ArrayList;

public class ShoppingCart {

  private ArrayList<Integer> productIds = new ArrayList<Integer>();
  private WebsiteInventory websiteInventory;
  private Customer customer;
  private PaymentProcessor paymentProcessor;

  public ShoppingCart(WebsiteInventory websiteInventory, Customer customer, PaymentProcessor paymentProcessor) {
    this.websiteInventory = websiteInventory;
    this.customer = customer;
    this.paymentProcessor = paymentProcessor;
  }

  public ArrayList<Integer> showShoppingCart() {
    return this.productIds;
  }

  public void addItemToCart(int productId) {
    productIds.add(productId);
  }

  public void removeItemFromCart(Integer productId) {
    productIds.remove(productId);
  }

  public Order createOrder() {
    ArrayList<Product> products = getProducts();
    int totalPrice = getTotalPrice(products);
    if (this.paymentProcessor.takePayment(totalPrice, this.customer)) {
      return new Order(this.customer, products, false);
    }
    return null;
  }

  private ArrayList<Product> getProducts() {
    ArrayList<Product> products = new ArrayList<Product>();
    for(int productId: this.productIds) {
      products.add(websiteInventory.removeProduct(productId));
    }
    return products;
  }

  private int getTotalPrice(ArrayList<Product> products) {
    int price = 0;
    for(Product product: products) {
      price += product.getPrice();
    }
    return price;
  }
  
}
