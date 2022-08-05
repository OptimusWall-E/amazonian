package amazonian;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class ShoppingCartTest {
  @Test
  public void showShoppingCartIsEmptyOnInit() {
    ShoppingCart shoppingCart = new ShoppingCart();
    ArrayList<Integer> productIds = shoppingCart.showShoppingCart();
    assertTrue(productIds.isEmpty());
  }

  @Test void canAddAProduct() {
    ShoppingCart shoppingCart = new ShoppingCart();
    shoppingCart.addItemToCart(3);
    ArrayList<Integer> productIds = shoppingCart.showShoppingCart();
    assertEquals(3, productIds.get(0));
  }

  @Test
  public void canRemoveAProduct() {
    ShoppingCart shoppingCart = new ShoppingCart();
    shoppingCart.addItemToCart(3);
    shoppingCart.removeItemFromCart(3);
    ArrayList<Integer> productIds = shoppingCart.showShoppingCart();
    assertTrue(productIds.isEmpty());
  }

  








   // @Test
  // public void canAddAProduct() {
  //   Product mockedProduct = mock(Product.class);
  //   WebsiteInventory mockedWebsiteInventory = mock(WebsiteInventory.class);
  //   when(mockedWebsiteInventory.removeProduct(3)).thenReturn(mockedProduct);
  //   ShoppingCart shoppingCart = new ShoppingCart(WebsiteInventory mockedWebsiteInventory);
  //   shoppingCart.addItemToCart(3);
  //   ArrayList<Product> items = shoppingCart.showShoppingCart();
  //   assertEquals(items.get(0), mockedProduct);
  // }

  
}
