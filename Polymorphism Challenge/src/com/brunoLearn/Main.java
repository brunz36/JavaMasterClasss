package com.brunoLearn;

class Car {

    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;

        this.wheels = 4;
        this.engine = true;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    public String startEngine() {
        return "Car -> Engine started";
    }

    public String accelerate() {
        return "Car -> Accelerate";
    }

    public String brake() {
        return "Car -> Brake";
    }
}

class Toyota extends Car {

    public Toyota(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Toyota -> Engine started";
    }

    @Override
    public String accelerate() {
        return "Toyota -> Accelerate";
    }

    @Override
    public String brake() {
        return "Toyota -> Brake";
    }
}

public class Main {

    public static void main(String[] args) {
        Car car = new Car(8, "Base Car");
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        Toyota toyota = new Toyota(6, "Tacoma");
        System.out.println(toyota.startEngine());
        System.out.println(toyota.accelerate());
        System.out.println(toyota.brake());

        BMW bmw = new BMW(6, "M3");
        System.out.println(bmw.startEngine());
        System.out.println(bmw.accelerate());
        System.out.println(bmw.brake());
    }
}
