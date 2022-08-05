package amazonian;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class ShoppingCartTest {
  @Test
  public void showShoppingCartIsEmptyOnInit() {
    PaymentProcessor mockedPaymentProcessor = mock(PaymentProcessor.class);
    WebsiteInventory mockedWebsiteInventory = mock(WebsiteInventory.class);
    Customer mockedCustomer = mock(Customer.class);
    ShoppingCart shoppingCart = new ShoppingCart(mockedWebsiteInventory, mockedCustomer, mockedPaymentProcessor);
    ArrayList<Integer> productIds = shoppingCart.showShoppingCart();
    assertTrue(productIds.isEmpty());
  }

  @Test void canAddAProduct() {
    PaymentProcessor mockedPaymentProcessor = mock(PaymentProcessor.class);
    WebsiteInventory mockedWebsiteInventory = mock(WebsiteInventory.class);
    Customer mockedCustomer = mock(Customer.class);
    ShoppingCart shoppingCart = new ShoppingCart(mockedWebsiteInventory, mockedCustomer, mockedPaymentProcessor);
    shoppingCart.addItemToCart(3);
    ArrayList<Integer> productIds = shoppingCart.showShoppingCart();
    assertEquals(3, productIds.get(0));
  }

  @Test
  public void canRemoveAProduct() {
    PaymentProcessor mockedPaymentProcessor = mock(PaymentProcessor.class);
    WebsiteInventory mockedWebsiteInventory = mock(WebsiteInventory.class);
    Customer mockedCustomer = mock(Customer.class);
    ShoppingCart shoppingCart = new ShoppingCart(mockedWebsiteInventory, mockedCustomer, mockedPaymentProcessor);
    shoppingCart.addItemToCart(3);
    shoppingCart.removeItemFromCart(3);
    ArrayList<Integer> productIds = shoppingCart.showShoppingCart();
    assertTrue(productIds.isEmpty());
  }

  @Test
  public void creatingAnOrder() {
    Customer mockedCustomer = mock(Customer.class);

    Product mockedProduct = mock(Product.class);
    when(mockedProduct.getPrice()).thenReturn(500);

    WebsiteInventory mockedWebsiteInventory = mock(WebsiteInventory.class);
    when(mockedWebsiteInventory.removeProduct(1)).thenReturn(mockedProduct);
    when(mockedWebsiteInventory.removeProduct(2)).thenReturn(mockedProduct);
    when(mockedWebsiteInventory.removeProduct(3)).thenReturn(mockedProduct);

    PaymentProcessor mockedPaymentProcessor = mock(PaymentProcessor.class);
    when(mockedPaymentProcessor.takePayment(1500, mockedCustomer)).thenReturn(true);

    ShoppingCart shoppingCart = new ShoppingCart(mockedWebsiteInventory, mockedCustomer, mockedPaymentProcessor);
    shoppingCart.addItemToCart(1);
    shoppingCart.addItemToCart(2);
    shoppingCart.addItemToCart(3);
    assertInstanceOf(Order.class, shoppingCart.createOrder());
    verify(mockedWebsiteInventory).removeProduct(1);
    verify(mockedWebsiteInventory).removeProduct(2);
    verify(mockedWebsiteInventory).removeProduct(3);
  }

}
