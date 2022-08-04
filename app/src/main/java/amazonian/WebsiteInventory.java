package amazonian;

import java.util.HashMap;

public class WebsiteInventory {

  private HashMap<Product, Integer> items = new HashMap<Product, Integer>();

  public HashMap<Product, Integer> viewProducts(){
    return this.items;
  }

  



}