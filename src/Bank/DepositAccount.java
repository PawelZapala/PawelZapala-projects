package Bank;

import java.math.BigDecimal;

public class DepositAccount extends Account {

    public DepositAccount(BigDecimal percents) {
        super(percents);
    }

    @Override
    public BigDecimal withDraw(BigDecimal amount) {
        if (getBalance().compareTo(amount) >= 0) {
            var currentBalance = getBalance().subtract(amount);
            return currentBalance;
        } else if (getBalance().compareTo(amount) < 0) {
            throw new NonSufficientFundsException("You don't have enough funds on your Deposit Account. Your account balance is " + getBalance());
        }
        return getBalance();
    }
        /**
         * For example current balance is +100 (plus 100)
         * percentage is 3%
         * after applying percentage current balance should be +103
         */
        @Override
        public BigDecimal applyPercentage () {
            //TODO: implement the method
            var currentBalance = getBalance().add(getBalance().multiply(getPercents()));
            return currentBalance;
        }

        @Override
        public BigDecimal transferMoney (String bankName,int accountNumber, BigDecimal amount){
            //TODO: implement the method
            var currentBalance = getBalance().subtract(amount);
            if (getBalance().compareTo(amount) < 0) {
                throw new NonSufficientFundsException("You don't have enough funds on your Deposit Account. Your account balance is " + getBalance());
            }
            return currentBalance;
        }
    }
