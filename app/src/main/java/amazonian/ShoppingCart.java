package amazonian;

import java.util.ArrayList;

public class ShoppingCart {

  private ArrayList<Integer> productIds = new ArrayList<Integer>();

  public ArrayList<Integer> showShoppingCart() {
    return this.productIds;
  }

  public void addItemToCart(int productId) {
    productIds.add(productId);
  }

  public void removeItemFromCart(int productId) {
    productIds.remove(productId);
  }
  
}
