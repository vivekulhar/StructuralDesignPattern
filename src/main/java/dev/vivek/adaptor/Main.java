package dev.vivek.adaptor;

public class Main {
    public static void main(String[] args) {

        PhonePe phonePe = new PhonePe(new ICICIBankApiAdapter());

        phonePe.getBalance("1234567890");
        phonePe.showBalance("1234567890");
        System.out.println(phonePe.sendMoney("1234567890", "0987654321", 100));
    }
}