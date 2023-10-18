package dev.vivek.adaptor;

public interface BankApi {
    double getBalance(String bankAccountNumber);
    boolean sendMoney(String fromBankAccountNumber,
                      String toBankAccountNumber, double amount);

}
