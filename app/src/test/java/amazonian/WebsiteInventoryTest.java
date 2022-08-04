package amazonian;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
// import java.util.HashMap;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;



public class WebsiteInventoryTest {
  @Test void items() {
    WebsiteInventory websiteInventory = new WebsiteInventory();
    ArrayList<Product> products = websiteInventory.viewProducts();
    assertTrue(products.isEmpty());
  }

  @Test void addProduct() {
    Product mockedProduct = mock(Product.class);
    WebsiteInventory websiteInventory = new WebsiteInventory();
    websiteInventory.addProduct(mockedProduct);
    ArrayList<Product> products = websiteInventory.viewProducts();
    assertTrue(products.contains(mockedProduct));  
  }

  @Test void removeProduct() {
    Product mockedProduct = mock(Product.class);
    Product mockedProduct2 = mock(Product.class);
    when(mockedProduct.getId()).thenReturn(2);
    when(mockedProduct2.getId()).thenReturn(2);
    WebsiteInventory websiteInventory = new WebsiteInventory();
    websiteInventory.addProduct(mockedProduct);
    websiteInventory.addProduct(mockedProduct2);
    Product removeProduct = websiteInventory.removeProduct(2);
    assertEquals(removeProduct.getId(), 2);
    ArrayList<Product> products = websiteInventory.viewProducts();
    assertEquals(products.size(), Integer.valueOf(1));  
  }
}
