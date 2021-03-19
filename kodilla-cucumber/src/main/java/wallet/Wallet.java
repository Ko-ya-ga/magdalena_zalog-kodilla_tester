package wallet;

public class Wallet {
    private int balance = 0;
    private int dailyLimit;

    public Wallet() {

    }

    public void deposit(int money) {
        this.balance += money;
    }

    public void debit(int money) {
        this.balance -= money;
    }

    public int getBalance() {
        return balance;
    }
}
