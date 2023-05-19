package se.example;

import se.example.classes_11.BankAccount2;

/**
 * Classes sample
 */
public class Main {
    public static void main(String[] args) {
        BankAccount2 account = new BankAccount2();

        account.setNumber("12345");
        account.setBalance(1000d);
        account.setCustomerName("Bob Brown");
        account.setCustomerEmail("myemail@bobo.com");
        account.setCustomerPhoneNumber("(087) 123-4567");

        account.withdrawFunds(100);
        account.depositFunds(250);
        account.withdrawFunds(50);

        account.withdrawFunds(200);

        account.depositFunds(100);
        account.withdrawFunds(45.55);
        account.withdrawFunds(54.46);

        account.withdrawFunds(54.45);
    }

}