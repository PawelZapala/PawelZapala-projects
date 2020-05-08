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
        //implement the method
        return null;
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
        return null;
    }

    @Override
    public BigDecimal transferMoney(String bankName, int accountNumber, BigDecimal amount) {
        //TODO: implement the method
        getBalance() = getBalance().subtract(amount);
        if (getBalance() > creditLimit){
            throw new ReachedCreditLimitException("You don't have enough funds on your Credit Account. Your account balance is " + getBalance());
        }
        return getBalance();
    }
}
