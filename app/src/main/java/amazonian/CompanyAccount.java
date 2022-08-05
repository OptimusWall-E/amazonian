package amazonian;

public class CompanyAccount {

  private int balance;

  public void addMoney(int money) {
    this.balance += money;
  }

  public void deductMoney(int money) {
    this.balance -= money;
  }

  public int getBalance() {
    return this.balance;
  }

}
