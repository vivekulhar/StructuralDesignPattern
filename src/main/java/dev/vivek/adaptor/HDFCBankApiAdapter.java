package dev.vivek.adaptor;

import dev.vivek.adaptor.apis.HDFCBankApi;

public class HDFCBankApiAdapter implements BankApi{
    private HDFCBankApi hdfcBankApi = new HDFCBankApi();
    @Override
    public double getBalance(String bankAccountNumber) {
        return hdfcBankApi.checkBalance(bankAccountNumber);
    }
    @Override
    public boolean sendMoney(String fromBankAccountNumber,
                             String toBankAccountNumber, double amount) {
        return hdfcBankApi.sendMoney(fromBankAccountNumber, toBankAccountNumber, amount);
    }
}
