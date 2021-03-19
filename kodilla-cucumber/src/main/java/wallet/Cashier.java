package wallet;

public class Cashier {

    private CashSlot cashSlot;

    public Cashier(CashSlot cashSlot) {
        this.cashSlot = cashSlot;
    }

    public void withdraw(Wallet wallet, int amount) {
        wallet.debit(amount);
        if (wallet.getBalance() > 0)
            cashSlot.dispense(amount);
        else
            wallet.deposit(amount);
    }
}
