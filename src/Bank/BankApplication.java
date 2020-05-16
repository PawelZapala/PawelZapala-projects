package Bank;

import java.math.BigDecimal;

public class BankApplication {
    private static final String ALIOR_BANK_NAME = "Alior Bank";
    private static final String MBANK_BANK_NAME = "mBank";

    public static void main(String[] args) {
        init();
    }

    private static void init() {
        NationalBank nb = NationalBank.getInstance();


        Bank alior = new Bank(ALIOR_BANK_NAME);
        Bank mbank = new Bank(MBANK_BANK_NAME);

        nb.registerBank(alior);
        nb.registerBank(mbank);

        Account aliorDeposit = new DepositAccount(BigDecimal.valueOf(3));
        Account aliorCredit = new CreditAccount(BigDecimal.valueOf(8), BigDecimal.valueOf(10_000));
        alior.addAccount(aliorCredit);
        alior.addAccount(aliorDeposit);

        aliorCredit.topUp(BigDecimal.valueOf(100));
        System.out.println(aliorCredit.balance);
        try {
            aliorCredit.withDraw(BigDecimal.valueOf(500));
            System.out.println(aliorCredit.balance);
        }catch (ReachedCreditLimitException e) {
            System.out.println(e.getMessage());
        }
        try {
            aliorCredit.transferMoney("mbank", 10, BigDecimal.valueOf(1000));
            System.out.println(aliorCredit.balance);
        } catch (ReachedCreditLimitException e) {
            System.out.println(e.getMessage());
        }
            aliorCredit.applyPercentage();
            System.out.println(aliorCredit.balance);
         try {
             aliorCredit.withDraw(BigDecimal.valueOf(15000));
             System.out.println(aliorCredit.balance);
         } catch (ReachedCreditLimitException e) {
             System.out.println(e.getMessage());
         }
         try {
            aliorCredit.withDraw(BigDecimal.valueOf(1500));
            System.out.println(aliorCredit.balance);
        } catch (ReachedCreditLimitException e) {
            System.out.println(e.getMessage());
        }

        aliorDeposit.topUp(BigDecimal.valueOf(1000));
        try {
            aliorDeposit.withDraw(BigDecimal.valueOf(500));
            System.out.println(aliorDeposit.balance);
        }catch (NonSufficientFundsException e) {
            System.out.println(e.getMessage());
        }
        try {
            aliorDeposit.transferMoney("mbank", 10, BigDecimal.valueOf(1000));
            System.out.println(aliorDeposit.balance);
        } catch (NonSufficientFundsException e) {
            System.out.println(e.getMessage());
        }
        aliorDeposit.applyPercentage();
        System.out.println(aliorDeposit.balance);
        try {
            aliorDeposit.withDraw(BigDecimal.valueOf(15000));
            System.out.println(aliorDeposit.balance);
        } catch (NonSufficientFundsException e) {
            System.out.println(e.getMessage());
        }
        try {
            aliorDeposit.withDraw(BigDecimal.valueOf(1500));
            System.out.println(aliorDeposit.balance);
        } catch (NonSufficientFundsException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(aliorCredit.getTransactionHistory());
        System.out.println(aliorDeposit.getTransactionHistory());

        Account mbankDeposit = new DepositAccount(BigDecimal.valueOf(2.5));
        Account mbankCredit = new CreditAccount(BigDecimal.valueOf(8), BigDecimal.valueOf(5_000));
        mbank.addAccount(mbankCredit);
        mbank.addAccount(mbankDeposit);

        try {
            mbankCredit.withDraw(BigDecimal.valueOf(500));
            System.out.println(mbankCredit.balance);
        }catch (ReachedCreditLimitException e) {
            System.out.println(e.getMessage());
        }
        mbankCredit.topUp(BigDecimal.valueOf(1000));
        System.out.println(mbankCredit.balance);
        try {
            mbankCredit.transferMoney("mbank", 10, BigDecimal.valueOf(1000));
            System.out.println(mbankCredit.balance);
        } catch (ReachedCreditLimitException e) {
            System.out.println(e.getMessage());
        }
        mbankCredit.applyPercentage();
        System.out.println(mbankCredit.balance);
        try {
            mbankCredit.withDraw(BigDecimal.valueOf(15000));
            System.out.println(mbankCredit.balance);
        } catch (ReachedCreditLimitException e) {
            System.out.println(e.getMessage());
        }
        try {
            mbankCredit.withDraw(BigDecimal.valueOf(1500));
            System.out.println(mbankCredit.balance);
        } catch (ReachedCreditLimitException e) {
            System.out.println(e.getMessage());
        }

        mbankDeposit.topUp(BigDecimal.valueOf(1000));
        try {
            mbankDeposit.withDraw(BigDecimal.valueOf(500));
            System.out.println(mbankDeposit.balance);
        }catch (NonSufficientFundsException e) {
            System.out.println(e.getMessage());
        }
        try {
            mbankDeposit.transferMoney("mbank", 10, BigDecimal.valueOf(1000));
            System.out.println(mbankDeposit.balance);
        } catch (NonSufficientFundsException e) {
            System.out.println(e.getMessage());
        }
        mbankDeposit.applyPercentage();
        System.out.println(mbankDeposit.balance);
        try {
            mbankDeposit.withDraw(BigDecimal.valueOf(15000));
            System.out.println(mbankDeposit.balance);
        } catch (NonSufficientFundsException e) {
            System.out.println(e.getMessage());
        }
        try {
            mbankDeposit.withDraw(BigDecimal.valueOf(1500));
            System.out.println(mbankDeposit.balance);
        } catch (NonSufficientFundsException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(mbankCredit.getTransactionHistory());
        System.out.println(mbankDeposit.getTransactionHistory());
    }
}
