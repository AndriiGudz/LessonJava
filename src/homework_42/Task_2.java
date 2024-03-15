package homework_42;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

/*
Дан список транзакций (Transaction) с полями amount, type (DEBIT/CREDIT), timestamp.
Используя Stream API, вычислите общую сумму для дебетовых и кредитных транзакций отдельно,
а также найдите транзакцию с максимальной суммой.
 */
public class Task_2 {
    public static void main(String[] args) {
        List<Transaction> transactions = List.of(
                new Transaction(100, Transaction.Type.DEBIT, 1), // DEBIT
                new Transaction(200, Transaction.Type.DEBIT, 2), // DEBIT
                new Transaction(300, Transaction.Type.CREDIT, 3), // CREDIT
                new Transaction(400, Transaction.Type.CREDIT, 4) // CREDIT
        );

        // Вычисление общей суммы для дебетовых транзакций
        int totalDebitAmount = transactions.stream()
                .filter(transaction -> transaction.getType() == Transaction.Type.DEBIT)
                .mapToInt(Transaction::getAmount)
                .sum();

        // Вычисление общей суммы для кредитных транзакций
        int totalCreditAmount = transactions.stream()
                .filter(transaction -> transaction.getType() == Transaction.Type.CREDIT)
                .mapToInt(Transaction::getAmount)
                .sum();

        // Нахождение транзакции с максимальной суммой
        Optional<Transaction> maxTransaction = transactions.stream()
                .max(Comparator.comparingInt(Transaction::getAmount));

        // Вывод результатов
        System.out.println("Total Debit Amount: " + totalDebitAmount);
        System.out.println("Total Credit Amount: " + totalCreditAmount);
        System.out.println("Transaction with Maximum Amount: " + maxTransaction.orElse(null));

    }
}
