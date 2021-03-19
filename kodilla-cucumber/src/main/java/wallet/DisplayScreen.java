package wallet;

public class DisplayScreen {

    public String displayBalance(Wallet wallet) {
        String message = "The balance of your wallet is " + wallet.getBalance();
        System.out.println(message);
        return message;
    }
}
