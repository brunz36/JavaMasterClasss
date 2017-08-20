package com.brunoLearn;

public class Main {

    public static void main(String[] args) {

        Hamburger hamburger = new Hamburger("Basic", "Ground 80/20", 5.00, "Sesame Seed Bun");
        double price = hamburger.itemizedHamburger();

        hamburger.addHamburgerAddition1("tomato", .75);
        hamburger.addHamburgerAddition2("lettuce", .50);
        hamburger.addHamburgerAddition3("bacon", 2.00);
        System.out.println("Total Burger price is " + hamburger.itemizedHamburger());

        HealthyBurger healthyBurger = new HealthyBurger("Bison", 9);
        healthyBurger.addHamburgerAddition1("Egg", 1);
        healthyBurger.addHealthAddition1("avacado", 1);
        System.out.println("Total Healthy Burger price $" + healthyBurger.itemizedHamburger());

        DeluxeBurger deluxeBurger = new DeluxeBurger();
        deluxeBurger.addHamburgerAddition3("Cant do this", 55);
        deluxeBurger.itemizedHamburger();
    }
}
