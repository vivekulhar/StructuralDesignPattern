package dev.vivek.adaptor.apis;

public class YesBankApi {
    public double checkBalance(String bankAccountNumber) {
        return 1000.00;
    }
    public boolean sendMoney(String fromBankAccountNumber,
                             String toBankAccountNumber, double amount) {
        return true;
    }
}
