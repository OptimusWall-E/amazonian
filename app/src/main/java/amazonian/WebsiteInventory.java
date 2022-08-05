package amazonian;

import java.util.ArrayList;

public class WebsiteInventory {

  private ArrayList<Product> items = new ArrayList<Product>();


  public void addProduct(Product item){
    this.items.add(item);
  }

  public Product removeProduct(int ID){
    for(int i = 0; i < items.size(); i++){
      if(items.get(i).getId() == ID){
        return items.remove(i);
      }
    }
    return null;
  }

  public ArrayList<Product> viewProducts(){
    return this.items;
  }

  



}