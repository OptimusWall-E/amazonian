package amazonian;

public class PaymentProcessor {

  private CompanyAccount companyAccount;

  public PaymentProcessor(CompanyAccount companyAccount) {
    this.companyAccount = companyAccount;
  }

  public boolean takePayment(int amount, Customer customer) {
    if(makeCardPayment(amount, customer.getCardDetails())) {
      companyAccount.addMoney(amount);
      return true;
    }
    return false;
  }

  private boolean makeCardPayment(int amount, String cardDetails) {
    return true;
  }

}
