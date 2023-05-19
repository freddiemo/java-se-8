package se.example;

import se.example.classes_11.BankAccount2;

/**
 * Classes sample
 */
public class Main {
    public static void main(String[] args) {
        BankAccount2 bobsAccount = new BankAccount2();
        System.out.println(bobsAccount.getNumber());
        System.out.println(bobsAccount.getBalance());

        BankAccount2 timsAccount = new BankAccount2("Tim", "ti@email.com", "12345");
        System.out.println("AccountNo: " + timsAccount.getNumber() + 
                "; name " + timsAccount.getCustomerName());
    }

}