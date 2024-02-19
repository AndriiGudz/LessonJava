package homework_24.task_0;

public class BankAccount implements PaymentSystem {
    private String accountNumber;

    public BankAccount(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    @Override
    public void transferMoney() {
        System.out.println("Деньги с счета " + accountNumber + " отправлены");
    }

    @Override
    public void withdrawMoney() {
        System.out.println("Снять деньги с счета " + accountNumber);
    }

    @Override
    public void checkBalance() {
        System.out.println("Проверить баланс счета " + accountNumber);
    }
}
