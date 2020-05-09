package Bank;

import java.math.BigDecimal;

public class CreditAccount extends  Account {
    private final BigDecimal creditLimit;

    public CreditAccount(BigDecimal percents, BigDecimal creditLimit) {
        super(percents);
        this.creditLimit = creditLimit;
    }
    @Override
    public BigDecimal withDraw(BigDecimal amount) {
        var currentBalance = getBalance().subtract(amount);
        if (creditLimit.compareTo(currentBalance) < 0) {
            throw new ReachedCreditLimitException("You don't have enough funds on your Credit Account. Your account balance is " + getBalance());
        }
        return currentBalance;
    }
    /**
     * For example current balance is -100 (minus 100)
     * percentage is 3%
     * after applying percentage current balance should be -103
     * <p>
     * For example current balance is +100 (plus 100)
     * percentage is 3%
     * after applying percentage current balance should be still +100
     */
    @Override
    public BigDecimal applyPercentage() {
        //TODO: implement the method
        var currentBalance = getBalance();
        if (currentBalance.compareTo(BigDecimal.ZERO) < 0) {
            currentBalance = getBalance().subtract(getBalance().multiply(getPercents()));
        } if (currentBalance.compareTo(BigDecimal.ZERO) > 0) {
            return getBalance();
        }
        return currentBalance;
    }

    @Override
    public BigDecimal transferMoney(String bankName, int accountNumber, BigDecimal amount) {
        //TODO: implement the method
        var currentBalance = getBalance().subtract(amount);
        if (creditLimit.compareTo(currentBalance) < 0){
            throw new ReachedCreditLimitException("You don't have enough funds on your Credit Account. Your account balance is " + getBalance());
        }
        return currentBalance;
    }
}
