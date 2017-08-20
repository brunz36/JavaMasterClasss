package com.brunoLearn;

public class Main {

    public static void main(String[] args) {

//        bankAccount thaisAccount = new bankAccount("12345", 101, "Thais", "thais@gmail.com", "813-495-8434");
//        thaisAccount.withdrawal(100);
//
//        thaisAccount.deposit(50);
//        thaisAccount.withdrawal(100);
//
//        thaisAccount.deposit(51);
//        thaisAccount.withdrawal(100);
//
//        bankAccount brunoAccount = new bankAccount("Bruno", "brunz36@gmail.com", "813-495-8434");
//        System.out.println(brunoAccount.getNumber() + " name " + brunoAccount.getCustomerName());

        vipCustomer thaisVip = new vipCustomer("Thais", 100000, "chata@gmail.com");
        System.out.println(thaisVip.getVipName() + " welcome to VIP Services.\n" +
                "Your email is " + thaisVip.getVipEmail() +
                "\nYour credit limit is : $" + thaisVip.getCreditLimit());


    }

}
