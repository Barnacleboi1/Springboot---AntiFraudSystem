package antifraud;


public class Transaction {
    private long amount;

    public Transaction() {}
    public Transaction(long amount) {
        this.amount = amount;
    }

    public long getAmount() {
        return amount;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }
}
