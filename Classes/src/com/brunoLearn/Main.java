package com.brunoLearn;

public class Main {

    public static void main(String[] args) {
        Car bmw = new Car();
        Car toyota = new Car();
        bmw.setModel("M3");
        toyota.setModel("Tacoma");


        System.out.println("My favorite car is " + bmw.getModel());
        System.out.println("My favorite truck is " + toyota.getModel());
    }
}
