package antifraud;

public enum TransactionStatus {
    ALLOWED("ALLOWED"),
    MANUAL_PROCESSING("MANUAL_PROCESSING"),
    PROHIBITED("PROHIBITED");

    private String result;
    TransactionStatus(String result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return result;
    }
}
