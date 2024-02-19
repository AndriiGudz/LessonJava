package homework_24.task_0;

public class ElectronicWallet implements PaymentSystem {
    private String walletNumber;

    public ElectronicWallet(String walletNumber) {
        this.walletNumber = walletNumber;
    }

    @Override
    public void transferMoney() {
        System.out.println("Деньги с счета " + walletNumber + " отправлены");
    }

    @Override
    public void withdrawMoney() {
        System.out.println("Снять деньги с счета " + walletNumber);
    }

    @Override
    public void checkBalance() {
        System.out.println("Проверить баланс счета " + walletNumber);
    }
}
