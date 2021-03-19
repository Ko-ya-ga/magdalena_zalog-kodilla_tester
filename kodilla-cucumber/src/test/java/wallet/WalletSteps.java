package wallet;

import io.cucumber.java8.En;
import org.junit.Assert;

public class WalletSteps implements En {

    private Wallet wallet = new Wallet();
    private CashSlot cashSlot = new CashSlot();
    private Cashier cashier = new Cashier(cashSlot);
    private DisplayScreen displayScreen = new DisplayScreen();

    public WalletSteps() {
        Given("I have deposited $200 in my wallet", () -> {
            wallet.deposit(200);
            Assert.assertEquals("Incorrect wallet balance", 200, wallet.getBalance());
        });

        When("I request $30", () -> {
            cashier.withdraw(wallet, 30);
        });

        Then("$30 should be dispensed", () -> {
            Assert.assertEquals(30, cashSlot.getContents());
        });

        Then("the balance of my wallet should be $170", () -> {
            Assert.assertEquals("Incorrect wallet balance", 170,  wallet.getBalance());
        });

        steps2();

        Given("there is $1000 in my wallet", () -> {
            wallet.deposit(1000);
        });

        When("I check the balance of my wallet", () -> {
            wallet.getBalance();
            Assert.assertEquals("Incorrect wallet balance", 1000, wallet.getBalance());
        });

        Then("I should see that the balance is $1000", () -> {
            Assert.assertEquals("The balance of your wallet is 1000", displayScreen.displayBalance(wallet));
        });
    }

    private void steps2() {
        Given("there is $100 in my wallet", () -> {
            wallet.deposit(100);
            Assert.assertEquals("Incorrect wallet balance", 100, wallet.getBalance());
        });

        When("I withdraw $200", () -> {
            cashier.withdraw(wallet, 200);
        });

        Then("nothing should be dispensed", () -> {
            Assert.assertEquals(0, cashSlot.getContents());
        });

        Then("the $100 should remain in the wallet", () -> {
            Assert.assertEquals("Incorrect wallet balance", 100, wallet.getBalance());
        });
    }
}
