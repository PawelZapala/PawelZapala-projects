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
        var currentBalance = balance.subtract(amount);
        if (creditLimit.compareTo(currentBalance) > 0) {
        balance = currentBalance;
        } else if (creditLimit.compareTo(balance) < 0) {
            throw new ReachedCreditLimitException("You don't have enough funds on your Credit Account. Your account balance is " + balance);
        }
        return balance;
    }
    @Override
    public BigDecimal applyPercentage() {
        if (balance.compareTo(BigDecimal.ZERO) < 0) {
            balance = balance.subtract(balance.multiply(getPercents()));
        } else if (balance.compareTo(BigDecimal.ZERO) > 0) {
            return balance;
        }
        return balance;

    }

    @Override
    public BigDecimal transferMoney(String bankName, int accountNumber, BigDecimal amount) {
        var currentBalance = balance.subtract(amount);
        if (creditLimit.compareTo(currentBalance) < 0) {
            balance = currentBalance;
            return balance;
        } else if (creditLimit.compareTo(currentBalance) > 0){
            throw new ReachedCreditLimitException("You don't have enough funds on your Credit Account. Your account balance is " + balance);
        }
        return balance;
    }
}
