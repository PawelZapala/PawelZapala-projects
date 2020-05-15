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
        this.percents = percents.divide(BigDecimal.valueOf(100));
        transactionHistory = new ArrayList<>();

    }

    public BigDecimal topUp(BigDecimal amount) {
        balance = balance.add(amount);
        addTransactionLog("Top up account in the amount of: " + amount, LocalDateTime.now());
        return balance;
    }

    protected void addTransactionLog(String logMessage, LocalDateTime time){
        transactionHistory.add("LOG MESSAGE: " + logMessage + " TIME: " + time.toString() + " CURRENT BALANCE: " + balance + "PLN");
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public List<String> getTransactionHistory() {
        return List.copyOf(transactionHistory);
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