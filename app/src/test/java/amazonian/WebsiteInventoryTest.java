package amazonian;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.HashMap;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;



public class WebsiteInventoryTest {
  @Test void items() {
    WebsiteInventory websiteInventory = new WebsiteInventory();
    HashMap<Product, Integer> products = websiteInventory.viewProducts();
    assertTrue(products.isEmpty());
  }

  @Test void addProduct() {
    Product mockedProduct = mock(Product.class);
    WebsiteInventory websiteInventory = new WebsiteInventory();
    websiteInventory.addProduct(mockedProduct, 1);
    HashMap<Product, Integer> products = websiteInventory.viewProducts();
    assertEquals(products.get(mockedProduct), Integer.valueOf(1));  
  }

}
