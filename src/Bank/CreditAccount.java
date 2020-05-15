package Bank;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class CreditAccount extends  Account {
    private final BigDecimal creditLimit;

    public CreditAccount(BigDecimal percents, BigDecimal creditLimit) {
        super(percents);
        this.creditLimit = creditLimit.negate();
    }
    @Override
    public BigDecimal withDraw(BigDecimal amount) {
        var currentBalance = balance.subtract(amount);

        if (creditLimit.compareTo(currentBalance) > 0) {
            throw new ReachedCreditLimitException("You don't have enough funds on your Credit Account to withdraw " + amount + " PLN. Your account balance is " + balance + " PLN");
            }
        balance = currentBalance;
        addTransactionLog("Withdrawal of " + amount + " PLN", LocalDateTime.now());
            return balance;
        }

    @Override
    public BigDecimal applyPercentage() {
        if (balance.compareTo(BigDecimal.ZERO) < 0) {
            balance = balance.add(balance.multiply(getPercents()));
            addTransactionLog("Capitalization of interest", LocalDateTime.now());
        }
        return balance;
    }

    @Override
    public BigDecimal transferMoney(String bankName, int accountNumber, BigDecimal amount) {
        var currentBalance = balance.subtract(amount);

        if (creditLimit.compareTo(currentBalance) > 0) {
            throw new ReachedCreditLimitException("You don't have enough funds on your Credit Account to transfer " + amount + " PLN. Your account balance is " + balance + " PLN");
        }
        balance = currentBalance;
        addTransactionLog("Transfer money from " + bankName + " " + accountNumber + " in the amount of: " + amount + " PLN", LocalDateTime.now());
            return balance;
    }
}
