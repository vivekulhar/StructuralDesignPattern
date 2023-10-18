package dev.vivek.adaptor;

import dev.vivek.adaptor.apis.YesBankApi;

public class YesBankApiAdapter implements BankApi{
    private YesBankApi yesBankApi = new YesBankApi();
    @Override
    public double getBalance(String bankAccountNumber) {
        return yesBankApi.checkBalance(bankAccountNumber);
    }

    @Override
    public boolean sendMoney(String fromBankAccountNumber,
                             String toBankAccountNumber, double amount) {
        return yesBankApi.sendMoney(fromBankAccountNumber, toBankAccountNumber, amount);
    }

}
