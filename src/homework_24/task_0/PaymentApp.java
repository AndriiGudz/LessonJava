package homework_24.task_0;

public class PaymentApp {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("DE238889999");
        bankAccount.transferMoney();
        bankAccount.withdrawMoney();
        bankAccount.checkBalance();

        System.out.println("\n=============================\n");

        ElectronicWallet electronicWallet = new ElectronicWallet("e92220000");
        electronicWallet.transferMoney();
        electronicWallet.withdrawMoney();
        electronicWallet.checkBalance();

    }
}
