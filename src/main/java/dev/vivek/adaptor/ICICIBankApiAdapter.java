package dev.vivek.adaptor;

import dev.vivek.adaptor.apis.ICICIBankApi;

public class ICICIBankApiAdapter implements BankApi{
    private ICICIBankApi iciciBankApi = new ICICIBankApi();
    @Override
    public double getBalance(String bankAccountNumber) {
        return 69;
    }
    @Override
    public boolean sendMoney(String fromBankAccountNumber,
                             String toBankAccountNumber, double amount) {
        return true;
    }
}
