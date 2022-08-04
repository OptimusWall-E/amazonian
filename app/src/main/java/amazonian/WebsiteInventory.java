package amazonian;

import java.util.HashMap;

public class WebsiteInventory {

  private HashMap<Product, Integer> items = new HashMap<Product, Integer>();


  public void addProduct(Product item, int quantity){
    this.items.put(item, quantity);
  }

  public HashMap<Product, Integer> viewProducts(){
    return this.items;
  }

  



}