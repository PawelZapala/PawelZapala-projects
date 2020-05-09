package Bank;

public class NonSufficientFundsException extends RuntimeException {
    public NonSufficientFundsException(String message) {
        super(message);
    }
}
