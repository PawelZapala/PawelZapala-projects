package Bank;

import java.util.HashSet;
import java.util.Set;

public class NationalBank{
    private Set<Bank> banks;

    public static NationalBank NATIONAL_BANK = null;

    private NationalBank() {
        banks = new HashSet<>();
    }

    public static NationalBank getInstance() {
        if (NATIONAL_BANK == null) {
            NATIONAL_BANK = new NationalBank();
        }
        return NATIONAL_BANK;
    }
}
