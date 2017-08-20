package com.brunoLearn;

class BMW extends Car {

    public BMW(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "BMW -> Engine started";
    }

    @Override
    public String accelerate() {
        return "BMW -> Accelerate";
    }

    @Override
    public String brake() {
        return "BMW -> Brake";
    }
}

