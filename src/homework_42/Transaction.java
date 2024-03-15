package homework_42;

public class Transaction {
    public enum Type {DEBIT, CREDIT}

    private int amount;
    private Type type;
    private long timestamp;

    public Transaction(int amount, Type type, long timestamp) {
        this.amount = amount;
        this.type = type;
        this.timestamp = timestamp;
    }

    public int getAmount() {
        return amount;
    }

    public Type getType() {
        return type;
    }

    public long getTimestamp() {
        return timestamp;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "amount=" + amount +
                ", type=" + type +
                ", timestamp=" + timestamp +
                '}';
    }
}
