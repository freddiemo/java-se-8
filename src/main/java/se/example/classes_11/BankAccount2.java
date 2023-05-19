package se.example.classes_11;

public class BankAccount2 {
    private String number;
    private double balance;
    private String customerName;
    private String customerEmail;
    private String customerPhoneNumber;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public void depositFunds(double depositAmount) {
        balance += depositAmount;
        System.out.println("Deposit of $" + depositAmount + " made. New balance is $" + this.balance);
    }

    public void withdrawFunds(double withdrawalAmount) {
        if ((balance - withdrawalAmount) < 0) {
            System.out.println("Insufficient Funds! You only have $" + balance + " in your account.");
        } else {
            this.balance -= withdrawalAmount;
            System.out.println("Widhdrawal of $" + withdrawalAmount + " processed, Reamining balance = $" + balance);
        }
    }

}
