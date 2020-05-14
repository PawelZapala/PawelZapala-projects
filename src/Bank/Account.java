package Bank;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public abstract class Account {
    private int accountNumber;
    protected BigDecimal balance;
    private BigDecimal percents;

    private List<String> transactionHistory;

    private static int lastAccountNumber;

    public Account(BigDecimal percents) {
        balance = BigDecimal.ZERO;
        accountNumber = ++lastAccountNumber;
        this.percents = percents;
        transactionHistory = new ArrayList<>();

    }

    public BigDecimal topUp(BigDecimal amount) {
        balance = balance.add(amount);
        return balance;
    }

    protected void addTransactionLog(String logMessage, LocalDateTime time){
    //TODO: implement the method
    //TODO: include message, time, balance after transaction

    }

    public List<String> getTransactionHistory() {
        //TODO: implement the method
        //TODO: return COPY(!!!) of the history
        return null;
    }

    public abstract BigDecimal withDraw(BigDecimal amount);

    public abstract BigDecimal applyPercentage();

    public abstract  BigDecimal transferMoney(String bankName, int accountNumber, BigDecimal amount);



    public BigDecimal getBalance(){
        return balance;
    }

    public BigDecimal getPercents() {
        return percents;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Account)) return false;
        Account account = (Account) o;
        return accountNumber == account.accountNumber &&
                Objects.equals(balance, account.balance);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountNumber, balance);
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountNumber=" + accountNumber +
                ", balance=" + balance +
                '}';
    }
}