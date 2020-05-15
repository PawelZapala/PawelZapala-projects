package Bank;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class DepositAccount extends Account {

    public DepositAccount(BigDecimal percents) {
        super(percents);
    }

    @Override
    public BigDecimal withDraw(BigDecimal amount) {
        if (balance.compareTo(amount) < 0) {
            throw new NonSufficientFundsException("You don't have enough funds on your Deposit Account to withdraw " + amount + ". Your account balance is " + balance + "PLN");
        }
            balance = balance.subtract(amount);
            addTransactionLog("Withdrawal of " + amount + " PLN", LocalDateTime.now());
            return balance;
    }
        @Override
        public BigDecimal applyPercentage () {
            balance = balance.add(balance.multiply(getPercents()));
            addTransactionLog("Capitalization of interest", LocalDateTime.now());
            return balance;
        }

        @Override
        public BigDecimal transferMoney (String bankName,int accountNumber, BigDecimal amount){
            var currentBalance = balance.subtract(amount);

            if (currentBalance.compareTo(BigDecimal.ZERO) < 0) {
                throw new NonSufficientFundsException("You don't have enough funds on your Deposit Account to transfer " + amount + " PLN. Your account balance is " + balance + " PLN");
            }
                balance = currentBalance;
                addTransactionLog("Transfer money from " + bankName + " " + accountNumber + " in the amount of: " + amount + " PLN", LocalDateTime.now());
                return balance;
        }
    }
