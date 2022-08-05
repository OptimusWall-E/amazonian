package amazonian;

import java.util.ArrayList;

public class OrderProcessor {
  private static ArrayList<Package> packages = new ArrayList<Package>();
  private static ArrayList<Product> weighedProducts = new ArrayList<Product>();
  private static int totalWeight = 0;
  private static Order currentOrder;
  
  public static ArrayList<Package> packageOrder(Order order) {
    currentOrder = order;
    for(Product product: currentOrder.getProducts()) {
      int productWeight = product.getWeight();
      if(weightLimitExceeded(productWeight)) {
        nextPackage();
      }
      weighedProducts.add(product);
      totalWeight += productWeight;
    }
    return packages;
  }

  private static void nextPackage() {
    packages.add(new Package(currentOrder, weighedProducts, totalWeight));
    weighedProducts = new ArrayList<Product>();
  }

  private static boolean weightLimitExceeded(int productWeight) {
    return (productWeight + totalWeight) > Package.MAX_WEIGHT;
  }
  
}
