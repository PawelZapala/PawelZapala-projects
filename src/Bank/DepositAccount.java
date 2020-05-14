package Bank;

import java.math.BigDecimal;

public class DepositAccount extends Account {

    public DepositAccount(BigDecimal percents) {
        super(percents);
    }

    @Override
    public BigDecimal withDraw(BigDecimal amount) {
        if (balance.compareTo(amount) >= 0) {
            balance = balance.subtract(amount);
            return balance;
        } else if (balance.compareTo(amount) < 0) {
            throw new NonSufficientFundsException("You don't have enough funds on your Deposit Account. Your account balance is " + balance);
        }
        return balance;
    }
        @Override
        public BigDecimal applyPercentage () {
            balance = balance.add(balance.multiply(getPercents()));
            return balance;
        }

        @Override
        public BigDecimal transferMoney (String bankName,int accountNumber, BigDecimal amount){
            var currentBalance = balance.subtract(amount);
            if (currentBalance.compareTo(BigDecimal.ZERO) > 0){
                balance = currentBalance;
                return balance;
            }else if (currentBalance.compareTo(BigDecimal.ZERO) < 0) {
                throw new NonSufficientFundsException("You don't have enough funds on your Deposit Account. Your account balance is " + getBalance());
            }
            return balance;
        }
    }
