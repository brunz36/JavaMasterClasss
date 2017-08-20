package com.brunoLearn;

public class Main {

    public static void main(String[] args) {

//        Dimensions dimensions = new Dimensions(20, 20, 5);
//        Case theCase = new Case("220B", "Corsair", "600", dimensions);
//
//        Monitor theMonitor = new Monitor("27Beast", "Acer", 27, new Resolution(2540, 1440));
//
//        Motherboard theMotherboard = new Motherboard("ROG", "Asus", 4, 6, "v2.44");
//
//        PC thePC = new PC(theCase, theMonitor, theMotherboard);
//
//        thePC.powerUp();

        Wall wall1 = new Wall("West");
        Wall wall2 = new Wall("South");
        Wall wall3 = new Wall("East");
        Wall wall4 = new Wall("North");

        Ceiling ceiling = new Ceiling(12, 55);

        Bed bed = new Bed("Modern", 4, 10, 1,1);

        Lamp lamp = new Lamp("Deco", false, 75);

        Room bedRooom = new Room("Bedroom1", wall1, wall2, wall3, wall4, ceiling, bed, lamp);

        bedRooom.makeBed();
        bedRooom.getLamp().turnOn();
        System.out.println(bedRooom.getBed().getStyle());
    }
}
