package se.example;

import se.example.classes_11.Customer5;

/**
 * Classes sample
 */
public class Main {
    public static void main(String[] args) {

        Customer5 customer = new Customer5("Tim", 1000d, "tim@email.com");
        System.out.println(customer.getName());
        System.out.println(customer.getCreditLimit());
        System.out.println(customer.getEmail());

        Customer5 secondCustomer = new Customer5();
        System.out.println(secondCustomer.getName());
        System.out.println(secondCustomer.getCreditLimit());
        System.out.println(secondCustomer.getEmail());

        Customer5 thirdCustomer = new Customer5("Joe", "joe@email.com");
        System.out.println(thirdCustomer.getName());
        System.out.println(thirdCustomer.getCreditLimit());
        System.out.println(thirdCustomer.getEmail());
    }

}