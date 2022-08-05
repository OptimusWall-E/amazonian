package amazonian;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class CustomerTest {

  @Test public void customerHasNoOrdersOnInit() {
    Customer customer = new Customer("Misha", "Telford", "makers@makers.com", "0800001066");
    ArrayList<Order> orders = customer.viewOrders();
    assertTrue(orders.isEmpty());
  }

  @Test public void addingAnOrder() {
    Order mockedOrder = mock(Order.class);
    Customer customer = new Customer("Misha", "Telford", "makers@makers.com", "0800001066");
    customer.addOrder(mockedOrder);
    ArrayList<Order> orders = customer.viewOrders();
    assertEquals(mockedOrder, orders.get(0));
  }
}