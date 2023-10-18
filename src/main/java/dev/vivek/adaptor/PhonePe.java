package dev.vivek.adaptor;

public class PhonePe {
    private BankApi bankApi;

    public PhonePe(BankApi bankApi) {
        this.bankApi = bankApi;
    }

    public PhonePe() {
    }
    public double getBalance(String bankAccountNumber) {
        return bankApi.getBalance(bankAccountNumber);
    }
    public void showBalance(String bankAccountNumber) {
        System.out.println("Your balance is: " + getBalance(bankAccountNumber));
    }
    public boolean sendMoney(String fromBankAccountNumber,
                             String toBankAccountNumber, double amount) {
        return bankApi.sendMoney(fromBankAccountNumber, toBankAccountNumber, amount);
    }

}
