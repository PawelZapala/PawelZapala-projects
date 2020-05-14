package Bank;

import java.util.HashSet;
import java.util.Set;

public class NationalBank{
    private Set<Bank> banks;

    public static NationalBank NATIONAL_BANK;

    private NationalBank() {
        banks = new HashSet<>();
    }

    public static NationalBank getInstance() {
        if (NATIONAL_BANK == null) {
            NATIONAL_BANK = new NationalBank();
        }
        return NATIONAL_BANK;
    }

    public Bank getByName(String name) throws BankNotFoundException {
        if (!banks.contains(name)) {
            throw new BankNotFoundException(name + " is not exist");
        }
        return null;
    }

    public void registerBank(Bank bank) {
        banks.add(bank);
    }
}
