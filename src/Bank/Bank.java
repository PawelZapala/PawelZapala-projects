package Bank;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Bank {
    private String name;
    private Set<Account> accounts;

    public Bank(String name) {
        this.name = name;
        accounts = new HashSet<>();
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public Account getByNumber(int number) throws AccountNotFoundException {
        if (!accounts.contains(number)) {
            throw new AccountNotFoundException(number + " number account is not exist");
        }
        return null;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "name='" + name + '\'' +
                ", accounts=" + accounts +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Bank)) return false;
        Bank bank = (Bank) o;
        return Objects.equals(name, bank.name) &&
                Objects.equals(accounts, bank.accounts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, accounts);
    }

}
